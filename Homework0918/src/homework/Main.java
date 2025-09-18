package homework;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 과제1
		Box box = new Box();
		box.setPassword("abc123");
		System.out.println("내 비밀번호는 " + box.getPassword());

		// 과제2
		TextBook book1 = new TextBook("자바의 세계", "토마토", 500, "자바");
		Novel book2 = new Novel("즐거운 자바 이야기", "당근", 200, "판타지");

		System.out.println("제목 : " + book1.getTitle() + ", 작가 : " + book1.getAuthor() + ", 가격 : " + book1.getPrice()
				+ "원, 과목명 : " + book1.getSubject());
		System.out.println("제목 : " + book2.getTitle() + ", 작가 : " + book2.getAuthor() + ", 가격 : " + book2.getPrice()
				+ "원, 장르 : " + book2.getGenre());

		// 과제3
		Car car = new Car(50.123);
		Bicycle bicycle = new Bicycle(100.5);

		car.move();
		bicycle.move();

		// 과제4
		Scanner sc = new Scanner(System.in);
		Person[] people = new Person[5];
		String name;
		int age;
		for (int i = 0; i < people.length; i++) {
			people[i] = new Person();

			System.out.println("이름과 나이를 입력해주세요.");

			name = sc.nextLine();
			people[i].setName(name);

			age = sc.nextInt();
			people[i].setAge(age);

			name = sc.nextLine();
		}
		sc.close();

		System.out.println(people[1].getName());
		for (Person person : people) {
			System.out.println("이름 : " + person.getName() + ", 나이 : " + person.getAge());
		}
		
		//과제5
		Product product = new Product();
		product.setName("토마토");
		product.setPrice(500);
		System.out.println(product.toString());
		
	}

}
