//package ch1;

import java.util.Random;

public class Homework0915 {
	public static int getChickenPieces(int n) {
		return n * 8;
	}

	public static int getCaffeineAmount(int cups) {
		return cups * 80;
	}

	public static int getTotalCalories(int count) {
		return count * 200;
	}

	public static int getLoveSuccessRate(String name1, String name2) {
		Random random = new Random();
		return random.nextInt(100);
	}

	public static String getRandomMenu() {
		String[] menu = { "라면", "김밥", "파스타", "샐러드" };
		Random random = new Random();

		return menu[random.nextInt(menu.length)];
	}

	public static String getGrade(int score) {
		if (score > 100 || score < 0)
			return "";
		else if (score >= 90)
			return "A";
		else if (score >= 80)
			return "B";
		else if (score >= 70)
			return "C";
		else if (score >= 60)
			return "D";
		else
			return "F";

	}
	public static int calculateWage(int money, int hours) {
		return money * hours;
	}

	public static void main(String[] args) {
		System.out.println("chicken : " + getChickenPieces(5));
		System.out.println("coffee : " + getCaffeineAmount(2));
		System.out.println("삼각김밥 : " + getTotalCalories(4));
		System.out.println("love : " + getLoveSuccessRate("apple", "tomato"));
		System.out.println("menu : " + getRandomMenu());
		System.out.println("grade : " + getGrade(85));
		System.out.println("wage : " + calculateWage(15000, 4));
	}
}
