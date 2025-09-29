package homework0926;

public class OrderMain {

	public static void main(String[] args) {

		String fileName = "DB/items.csv";
		OrderDAO dto = new OrderDAO(fileName);
		OrderService service = new OrderService(dto);
		OrderController controller = new OrderController(service);
		
		controller.run();
	}

}
