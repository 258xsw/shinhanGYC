package homework0919;

import java.util.ArrayList;
import java.util.List;
public class GymDAO {
	
	private List<GymDTO> gymList = new ArrayList<GymDTO>();
	
	public void save(GymDTO dto) {
		gymList.add(dto);
	}
	
	public List<GymDTO> findAll() {
		return gymList;
	}

}
