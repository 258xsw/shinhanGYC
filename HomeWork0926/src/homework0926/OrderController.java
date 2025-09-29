package homework0926;

import java.util.Scanner;

public class OrderController {
	private OrderService service;

	Scanner sc = new Scanner(System.in);

	public OrderController(OrderService service) {
		this.service = service;
	}
	
	public void run() {
		while (true) {
			System.out.println("1. 주문 등록, 2. 전체 주문 조회, 3. 개별 주문 조회, 4. 주문 삭제, 5. 주문 정보 수정, 6. 분석, 0. 종료");
			int q = sc.nextInt();
			sc.nextLine();

			switch (q) {
			case 1:
				addOrder();
				break;
			case 2:
				outAllOrder();
				break;
			case 3:
				outOrderById();
				break;
			case 4:
				deleteOrder();
				break;
			case 5:
				updateOrder();
				break;
			case 6:
				outReport();
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;

			default:
				System.out.println("올바른 값을 입력해주세요.");
			}
		}
	
		
	}

	private void addOrder() {
	//	품명, 가격, 주문가능수, 현재재고(주문 후 남은 수량)
		System.out.println("품명 : ");
		String name = sc.nextLine();
		System.out.println("가격 : ");
		int price = sc.nextInt();
		System.out.println("주문 가능 수 : ");
		int maxOrderQty = sc.nextInt();
		System.out.println("현재 재고 : ");
		int stockQty = sc.nextInt();
		sc.nextLine();

		service.saveOrder(name, price, maxOrderQty, stockQty);
	}

	private void outAllOrder() {
		for(OrderDTO dto : service.getAllOrder()) {
			System.out.println(dto);
		}
		
	}

	private void outOrderById() {
		System.out.println("주문 번호를 입력해주세요.");
		int id = sc.nextInt();
		OrderDTO dto = service.getById(id);
		if(dto != null) {
			System.out.println(dto);
		}
		else {
			System.out.println("해당 주문이 존재하지 않습니다.");
		}
	}

	private void deleteOrder() {
		System.out.println("삭제할 주문 번호를 입력해주세요.");
		int id = sc.nextInt();
		
		if(service.deleteOrder(id)) {
			System.out.println("주문이 삭제되었습니다.");
		}
		else {
			System.out.println("해당 주문이 존재하지 않습니다.");
		}
	
	}

	private void updateOrder() {
		System.out.println("수정할 주문 번호를 입력하세요.");
		int id = sc.nextInt();
		sc.nextLine();
		OrderDTO dto = service.getById(id);
		if(dto == null) {
			System.out.println("해당 주문이 존재하지 않습니다.");
			return;
		}
		
		System.out.println("변경할 상품명 : ");
		String name = sc.nextLine();
		System.out.println("변경할 가격 : ");
		int price = sc.nextInt();
		System.out.println("변경할 주문 가능 수 : ");
		int maxOrderQty = sc.nextInt();
		System.out.println("변경할 현재 재고 : ");
		int stockQty = sc.nextInt();
		sc.nextLine();
		
		if(service.updateOrder(id, name, price, maxOrderQty, stockQty)) {
			System.out.println("수정 완료");
		}else {
			System.out.println("수정 실패");
		}
	}

	private void outReport() {
		System.out.println("뭐에 대한 통계가 필요한걸까?");
	}
	
	

}
