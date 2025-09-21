package homework0919;

import java.util.ArrayList;
import java.util.List;

public class FoodSystemDAO {
	private List<FoodSystemDTO> foodSystemList = new ArrayList<FoodSystemDTO>();

	public void save(FoodSystemDTO dto) {
		foodSystemList.add(dto);
	}
	
	public List<FoodSystemDTO> findAll() {
		return foodSystemList;
	}

}
