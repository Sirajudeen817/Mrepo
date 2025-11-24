package test1.com.Nov22;

public class Fruits {

	
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public String getFruitColor() {
		return fruitColor;
	}
	public void setFruitColor(String fruitColor) {
		this.fruitColor = fruitColor;
	}
	public double getFruitCost() {
		return fruitCost;
	}
	public void setFruitCost(double fruitCost) {
		this.fruitCost = fruitCost;
	}
	private String fruitName;
	private String fruitColor;
	private double fruitCost;
	
	public Fruits(String fruitName, String fruitColor, double fruitCost) {
		super();
		this.fruitName = fruitName;
		this.fruitColor = fruitColor;
		this.fruitCost = fruitCost;
	}
	
	public double calculateCostPerDozen()
	{
		return fruitCost*12;
	}
	
	
}
