package homework0919;

import java.util.List;

public class FoodSystemService {
	private FoodSystemDAO dao;

	public FoodSystemService(FoodSystemDAO dao) {
		this.dao = dao;
	}
	
	public void addIngredient(int ingredientNumber, String ingredientName, int quantity, int registerDate) {
		FoodSystemDTO dto = new FoodSystemDTO(ingredientNumber, ingredientName, quantity, registerDate);
		dao.save(dto);
	}
	
	public List<FoodSystemDTO> getAll() {
		return dao.findAll();
	}

}
