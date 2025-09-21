package homework0919;

import java.util.Scanner;

public class FoodSystemController {

	Scanner sc = new Scanner(System.in);
	private FoodSystemService service;

	public FoodSystemController(FoodSystemService service) {
		this.service = service;
	}

	public void run() {
		while (true) {
			System.out.println("1. 식자재 등록, 2. 식자재 확인, 3. 종료");
			int q = sc.nextInt();
			sc.nextLine();

			switch (q) {
			case 1: {
				System.out.println("식자재번호 : ");
				int ingredientNumber = sc.nextInt();
				sc.nextLine();
				System.out.println("식자재명 : ");
				String ingredientName = sc.nextLine();
				System.out.println("수량 : ");
				int quantity = sc.nextInt();
				sc.nextLine();
				System.out.println("등록날짜 : ");
				int registerDate = sc.nextInt();
				sc.nextLine();
				service.addIngredient(ingredientNumber, ingredientName, quantity, registerDate);
				break;
			}
			case 2: {
				for (FoodSystemDTO foodSystem : service.getAll())
					System.out.println("식자재 번호 : " + foodSystem.getIngredientNumber() + " 식자재 명 : "
							+ foodSystem.getIngredientName() + " 수량 : " + foodSystem.getQuantity() + " 등록 날짜 : "
							+ foodSystem.getRegisterDate());
				break;
			}
			case 3: {
				System.out.println("프로그램 종료");
				return;
			}
			default:
				System.out.println("올바른 값을 입력하세요.");
			}
		}
	}

}
