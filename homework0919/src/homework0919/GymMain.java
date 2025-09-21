package homework0919;

public class GymMain {
	public static void main(String[] args) {
		GymDAO dao = new GymDAO();
		GymService service = new GymService(dao);
		GymController controller = new GymController(service);
		
		controller.run();

	}

}
