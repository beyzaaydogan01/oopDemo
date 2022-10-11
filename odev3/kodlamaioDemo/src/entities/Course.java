package entities;

public class Course{
	String name;
	public double price;
	String category;
	String explanation;
	

	public Course(String name, double price, String category, String explanation) {
		this.name = name;
		this.price = price;
		this.category = category;
		this.explanation = explanation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	
	

}
