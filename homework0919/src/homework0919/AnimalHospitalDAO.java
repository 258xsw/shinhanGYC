package homework0919;

import java.util.ArrayList;
import java.util.List;

public class AnimalHospitalDAO {
	
	private List<AnimalHospitalDTO> animalHospitalList = new ArrayList<AnimalHospitalDTO>();
	
	public void save(AnimalHospitalDTO dto) {
		animalHospitalList.add(dto);
	}
	
	public List<AnimalHospitalDTO> findAll() {
		return animalHospitalList;
	}

}
