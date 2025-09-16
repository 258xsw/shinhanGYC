//package ch1;

import java.util.Scanner;

public class Deposit {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------------");
			System.out.println("선택> ");

			int option = scanner.nextInt();

			// 작성 위치
			switch (option) {
				case 1:
					System.out.println("입금액을 입력하세요.");
					int depositAmount = scanner.nextInt();
					if (depositAmount > 0) {
						System.out.println(depositAmount + "원 입금되었습니다.");
						balance += depositAmount;
					} else {
						System.out.println("입금할 수 없습니다.");
					}
					break;

				case 2:
					System.out.println("출금액을 입력하세요.");
					int withdrawAmount = scanner.nextInt();
					if (withdrawAmount > balance)
						System.out.println("출금할 수 없습니다.");
					else {
						System.out.println(withdrawAmount + "원이 출금되었습니다.");
						balance -= withdrawAmount;
					}

					break;
				case 3:
					System.out.println("잔고 : " + balance + "원");
					break;
				case 4:
					run = false;
					break;
				default:
					System.out.println("잘못된 입력입니다.");
			}
		}
		scanner.close();
		System.out.println("프로그램 종료");
	}
}
