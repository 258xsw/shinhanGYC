package homework0926;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


/*
 * try/catch에서 close안해도 괜찮은건가요?!
 * 
 */

public class OrderDAO {

	private String filename;
	List<OrderDTO> orderList = new ArrayList<OrderDTO>();

	public OrderDAO(String filename) {
		super();
		this.filename = filename;
		this.orderList = loadCsv(filename);
	}

	private List<OrderDTO> loadCsv(String filename2) {

		List<OrderDTO> list = new ArrayList<OrderDTO>();

		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));

			String line;
			boolean isSkip = true;
			while ((line = br.readLine()) != null) {
				if (isSkip) {
					isSkip = false;
					continue;
				}

				String[] parts = line.split(",");
				int id = Integer.parseInt(parts[0].trim());

				String name = parts[1].trim();
				int price = Integer.parseInt(parts[2].trim());
				int maxOrderQty = Integer.parseInt(parts[3].trim());
				int stockQty = Integer.parseInt(parts[4].trim());


				list.add(new OrderDTO(id, name, maxOrderQty, stockQty));
			}

		} catch (Exception e) {
			System.out.println("에러 발생 ! " + e);
		}

		return list;
	}

	public void save(OrderDTO dto) {
		orderList.add(dto);
		writeCsv();
	}

	public List<OrderDTO> findAll() {
		return orderList;
	}

	public OrderDTO findById(int id) {
		for (OrderDTO dto : orderList) {
			if (dto.getId() == id) {
				return dto;
			}
		}
		return null;
	}

	public boolean deleteById(int id) {
		for (int i = 0; i < orderList.size(); i++) {
			if (orderList.get(i).getId() == id) {
				orderList.remove(i);
				return true;
			}
		}
		return false;
	}

	public boolean updateDAO(int id, String newName, int newPrice, int newmaxOrderQty, int newstockQty) {
		for (int i = 0; i < orderList.size(); i++) {
			if (orderList.get(i).getId() == id) {
				orderList.get(i).setName(newName);
				orderList.get(i).setPrice(newPrice);
				orderList.get(i).setStockQty(newmaxOrderQty);
				orderList.get(i).setStockQty(newstockQty);

				return true;
			}
		}
		return false;
	}

	public int count() {
		return orderList.size();
	}

	private void writeCsv() {
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(filename));
			pw.println("id, name, price, maxOrderQty, stockQty");
			for (OrderDTO dto : orderList) {
				pw.printf("%d, %s, %d, %d, %d", dto.getId(), dto.getName(), dto.getPrice(), dto.getMaxOrderQty(), dto.getStockQty());
			}
		} catch (IOException e) {
			System.out.println("저장 실패");
		}

	}

}
