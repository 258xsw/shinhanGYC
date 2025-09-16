//package ch2;

public class Homework0910 {
	public static void main(String[] args) {
		
		//변수 선언
		int apple = 12;
		int year = 2025;
		int money = -1000;
		System.out.println("apple : " + apple);
		System.out.println("year : " + year);
		System.out.println("money : " + money);
		
		double length = 9.8;
		double score = 88.5;
		double minusValue = -4.6;
		System.out.println("length : " + length);
		System.out.println("score : " + score);
		System.out.println("minusValue : " + minusValue);
		
		String food = "떡볶이";
		String city = "서울";
		String hobby = "코딩";
		System.out.println("food : " + food);
		System.out.println("city : " + city);
		System.out.println("hobby : " + hobby);

		
		boolean hasCar = false;
		boolean isStudent = true;
		boolean isWeekend = false;
		System.out.println("hasCar : " + hasCar);
		System.out.println("isStudent : " + isStudent);
		System.out.println("isWeekend : " + isWeekend);

		
		//1
		int a = 10, b = 3;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		int sum = 12 + 8;
		int total = 20 / 3;
		int mod = 14 % 5;
		System.out.println(sum);
		System.out.println(total);
		System.out.println(mod);


		/*
		 * 6. 5 % 4의 나머지가 1이기 때문에 결과는 1입니다.
		 * 7. 5 % 3의 나머지가 2이기 때문에 결과는 2입니다.
		 * 8. 5 % 2의 나머지가 3이기 때문에 결과는 3입니다.
		 * 9. 5 % 1의 나머지가 4이기 때문에 결과는 4입니다.
		 * 10. 5 % 7의 나머지가 0이기 때문에 결과는 5입니다.
		 * 11. 5 % 0으로 나눌 수 없기 때문에 결과는 에러입니다.
		 */
		System.out.println(5 % 5);
		System.out.println(5 % 4);
		System.out.println(5 % 3);
		System.out.println(5 % 2);
		System.out.println(5 % 1);
		System.out.println(5 % 7);
		//System.out.println(5 % 0);
		
		
		boolean result1 = (15 > 20);
		boolean result2 = (10 == 1);
		boolean result3 = (7 <= 3);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

		
		a = 5;
		b = 7;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		boolean logic1 = ((10 > 5) && (2 > 1));
		boolean logic2 = ((3 == 7) || (6 < 2));
		boolean logic3 = (8 != 81);
		System.out.println(logic1);
		System.out.println(logic2);
		System.out.println(logic3);
				
		boolean x = true;
		boolean y = false;
		System.out.println(!x);
		System.out.println(!y);
	}

}
