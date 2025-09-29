package homework0926;

import java.util.List;

public class OrderService {
	private OrderDAO dao;
	private int nextId = 1;

	public OrderService(OrderDAO dao) {
		this.dao = dao;
	}

	
	/*
	
	getId() 부분이 잘 이해가 가지 않는데 담에 눈높이 설명 좀 부탁드리겠습니다...^.^
	
	*/
	
	private int getId() {
		int max = 0;
		for(OrderDTO dto : dao.findAll()) {
			if(max < dto.getId())
				max = dto.getId();
		}
		return max;
	}
	
	public void saveOrder(String name, int price, int maxOrderQty, int stockQty) {
		dao.save(new OrderDTO(nextId++, name, maxOrderQty, stockQty));
	}
	
	public List<OrderDTO> getAllOrder() {
		return dao.findAll();
	}
	
	public OrderDTO getById(int id) {
		return dao.findById(id);
	}
	
	public boolean deleteOrder (int id) {
		return dao.deleteById(id);
	}
	
	public boolean updateOrder(int id, String newName, int price, int maxOrderQty, int stockQty) {
		if(dao.updateDAO(id, newName, price, maxOrderQty ,stockQty)) {
			return true;
		}
		return false;
	}
	
}
