package homework0919;

import java.util.Scanner;

public class AnimalHospitalController {

	Scanner sc = new Scanner(System.in);
	private AnimalHospitalService service;

	public AnimalHospitalController(AnimalHospitalService service) {
		this.service = service;
	}

	public void run() {
		while (true) {
			System.out.println("1. 등록, 2. 조회, 3. 프로그램 종료");
			int q = sc.nextInt();
			sc.nextLine();

			switch (q) {
			case 1: {
				System.out.println("아이디 : ");
				String id = sc.nextLine();
				System.out.println("보호자 명 : ");
				String guardianName = sc.nextLine();
				System.out.println("펫 이름 : ");
				String petName = sc.nextLine();
				System.out.println("펫 나이 : ");
				int petAge = sc.nextInt();
				sc.nextLine();
				System.out.println("연락처 :");
				String contactNumber = sc.nextLine();
				service.addAnimal(id, guardianName, petName, petAge, contactNumber);
				break;
			}
			case 2: {
				for(AnimalHospitalDTO animal : service.getAllAnimal())
					System.out.println("아이디 : " + animal.getId() + " 보호자 명 : " + animal.getGuardianName() + " 펫 이름 : " + animal.getPetName() + " 펫 나이 : " + animal.getPetAge() + " 연락처 : " + animal.getContactNumber());
					
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
