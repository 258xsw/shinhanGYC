package homework0926;

import java.text.DecimalFormat;

public class OrderDTO {

	private int id;
	private String name;
	private int price;
	private int maxOrderQty;
	private int stockQty;

	public OrderDTO(int id, String name, int maxOrderQty, int stockQty) {
		this.id = id;
		this.name = name;
		this.maxOrderQty = maxOrderQty;
		this.stockQty = stockQty;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxOrderQty() {
		return maxOrderQty;
	}

	public void setMaxOrderQty(int maxOrderQty) {
		this.maxOrderQty = maxOrderQty;
	}

	public int getStockQty() {
		return stockQty;
	}

	public void setStockQty(int stockQty) {
		this.stockQty = stockQty;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	DecimalFormat df = new DecimalFormat("#,###");

	@Override
	public String toString() {
		return String.format("번호 %d | 상품명 : %s | 가격 : %s원 |주문 가능 수 : %d개 | 현재 재고 : %s\n", id, name, df.format(price), maxOrderQty, stockQty);
	}

}
