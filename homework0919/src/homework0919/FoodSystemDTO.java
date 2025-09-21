package homework0919;

public class FoodSystemDTO {
	private int ingredientNumber;
	private String ingredientName;
	private int quantity;
	private int registerDate;
	
	public FoodSystemDTO(int ingredientNumber, String ingredientName, int quantity, int registerDate) {
		this.ingredientNumber = ingredientNumber;
		this.ingredientName = ingredientName;
		this.quantity = quantity;
		this.registerDate = registerDate;
	}
	
	public int getIngredientNumber() {
		return ingredientNumber;
	}
	public void setIngredientNumber(int ingredientNumber) {
		this.ingredientNumber = ingredientNumber;
	}
	public String getIngredientName() {
		return ingredientName;
	}
	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(int registerDate) {
		this.registerDate = registerDate;
	}
	
}
