package ch1;

import java.util.Scanner;

public class Homework0911 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 비밀번호 맞추기
		String pw = sc.nextLine();
		if (pw.equals("qwer1234")) {
			System.out.println("비밀번호가 맞아요!");
		} else {
			System.out.println("비밀번호가 틀렸어요!");
		}

		// 좋아하는 동물 찾기
		String animal = sc.nextLine();
		if (animal.equals("강아지"))
			System.out.println("멍멍!");
		else if (animal.equals("고양이"))
			System.out.println("야옹!");
		else
			System.out.println("무슨 동물이야?");

		// 주말 맞추기
		int day = sc.nextInt();
		if (day == 0 || day == 6)
			System.out.println("주말이야");
		else
			System.out.println("평일이야!");
	
		//나이검사기
		int age = sc.nextInt();
		if(age >= 19)
			System.out.println("성인입니다.");
		else
			System.out.println("미성년입니다.");
	
		
		//카페인 섭취에 따른 내 상태
		System.out.println("오늘 마신 커피 수를 입력하세요.");
		int coffee = sc.nextInt();
		if(coffee >= 3)
			System.out.println("기분 좋은 상태! 😄");
		else if(coffee >= 1)
			System.out.println("완전 맑은 정신~ 🍀");
		else
			System.out.println("여긴 어디? 😵");
		
		//숫자 입력받아 짝수/홀수/출력
		int num = sc.nextInt();
		if(num % 2 == 0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
	}

}
