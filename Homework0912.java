//package ch2;

import java.util.Random;
import java.util.Scanner;

public class Homework0912 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//치킨 주문 알림기
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println("치킨 " + i + "마리 주문이요");
		}
		
		//스쿼트 계산기
		System.out.println("스쿼트 몇 번 할까요?");
		n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println("스쿼트 " + i + "회 완료");
		}
		System.out.println("오늘 운동 끝");
		
		//입력받은 수의 짝수만 출력하는 계산기
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			if(i % 2 == 0)
				System.out.println(i);
		}
		
		//두 수를 입력받아 그 사이 숫자 모두 출력
		int front = sc.nextInt();
		int end = sc.nextInt();
		while(front < end) {
			System.out.println(front);
			front++;
		}
		
		//구구단 3단 출력
		for(int i = 1; i < 10; i++) {
			System.out.println("3 * " + i + " = " + 3 * i);
		}
		
		//입력한 수로 구구단을 만드세요
		n = sc.nextInt();
		for(int i = 1; i < 10; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}
		
		//숫자를 입력하면 3의 배수일때만 점프 출력
		n = sc.nextInt();
		if(n % 3 == 0)
			System.out.println("점프!");
		else
			System.out.println("패스");
		
		//정수를 입력받아 정사각형 별 출력
		n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int k = 1; k <= n; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//피자 조각 개수와 사람 수
		int pizza = sc.nextInt();
		int people = sc.nextInt();
		
		System.out.println("한 사람 당 피자 " + pizza / people + "조각, 남는 피자는 " + pizza % people + "조각");
		
		//주사위 2번 던지기
		int frist = sc.nextInt();
		int second = sc.nextInt();
		
		System.out.println("첫 번째 주사위 : " + frist + ", 두 번째 주사위 : " + second + "-> 두 수의 합 : " + (frist + second));
		
		//랜덤 숫자
		Random random = new Random();
		int num = random.nextInt(50) + 1;
		n = sc.nextInt();
		while(n != num) {
			if(n > num)
				System.out.println("DOWN");
			else
				System.out.println("UP");
			n = sc.nextInt();

		}
		System.out.print("정답은 " + num + "입니다!");
		
		sc.close();
	}

	
}
