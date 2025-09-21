package homework0919;

public class AnimalHospitalMain {

	
	public static void main(String[] args) {
		AnimalHospitalDAO dao = new AnimalHospitalDAO();
		AnimalHospitalService service = new AnimalHospitalService(dao);
		AnimalHospitalController controller = new AnimalHospitalController(service);

		controller.run();
	}
}
