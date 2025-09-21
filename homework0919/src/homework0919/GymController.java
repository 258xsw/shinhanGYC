package homework0919;

import java.util.Scanner;

public class GymController {

	Scanner sc = new Scanner(System.in);
	private GymService service;

	public GymController(GymService service) {
		this.service = service;
	}
	public void run() {
		while (true) {
			System.out.println("1. 등록, 2. 조회, 3. 프로그램 종료");
			int q = sc.nextInt();
			sc.nextLine();

			switch (q) {
			case 1: {
				System.out.println("회원 명 : ");
				String memberName = sc.nextLine();
				System.out.println("회원 번호 : ");
				int memberId = sc.nextInt();
				sc.nextLine();
				System.out.println("기준 칼로리 : ");
				int baseCalorie = sc.nextInt();
				sc.nextLine();
				System.out.println("소비 칼로리 : ");
				int consumedCalorie = sc.nextInt();
				sc.nextLine();
				
				service.addMember(memberName, memberId, baseCalorie, consumedCalorie);
				break;
			}
			case 2: {
				for(GymDTO member : service.getAll())
					System.out.println("회원 명 : " + member.getMemberName() + " 회원 번호 : " + member.getMemberId() + "기준 칼로리 : " + member.getBaseCalorie() + "감소 칼로리 : " + member.getConsumedCalorie());
		
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
