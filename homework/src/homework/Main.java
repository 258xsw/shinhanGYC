package homework;

public class Main {
	
	public static void main(String[] args) {
		//idol
		Idol idol1 = new Idol("rumi", "vocal", "HUNTR/X");
		Idol idol2 = new Idol("mira", "Dancer", "HUNTR/X");
		Idol idol3 = new Idol("zoey", "Rapper", "HUNTR/X");

		//pizza
		Pizza pizza = new Pizza();
		pizza.type = "Peperoni";
		pizza.size = "L";
		
		System.out.println(pizza.type + "피자 " + pizza.size + "사이즈 주세요!");
		
		//song
		Song song = new Song();
		song.title = "Fight Music";
		song.artist = "SEKAI NO OWARI";
		
		song.play();
		
		//instagram
		InstagramPost instagramPost = new InstagramPost();
		instagramPost.author = "민지";
		instagramPost.content = "오늘 날씨 짱";
		System.out.println("작성자 : " + instagramPost.author);
		System.out.println("내용 : " + instagramPost.content);

		//delivery
		DeliveryOrder deliveryOrder = new DeliveryOrder();
		deliveryOrder.food = "떡볶이";
		deliveryOrder.address = "기숙사";
		deliveryOrder.deliver();
		
	}
	
}
