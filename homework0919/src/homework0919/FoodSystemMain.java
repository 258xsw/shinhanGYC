package homework0919;

import java.util.Scanner;

public class FoodSystemMain {
	public static void main(String[] args) {
		FoodSystemDAO dao = new FoodSystemDAO();
		FoodSystemService service = new FoodSystemService(dao);
		FoodSystemController controller = new FoodSystemController(service);
		
		controller.run();
		
	}
	

}
