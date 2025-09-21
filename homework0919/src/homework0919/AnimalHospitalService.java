package homework0919;

import java.util.List;

public class AnimalHospitalService {

	private AnimalHospitalDAO dao;

	public AnimalHospitalService(AnimalHospitalDAO dao) {
		this.dao = dao;
	}

	public void addAnimal(String id, String guardianName, String petName, int petAge, String contactNumber) {
		AnimalHospitalDTO dto = new AnimalHospitalDTO(id, guardianName, petName, petAge, contactNumber);
		dao.save(dto);
	}
	
	public List<AnimalHospitalDTO> getAllAnimal() {
		return dao.findAll();
	}

}
