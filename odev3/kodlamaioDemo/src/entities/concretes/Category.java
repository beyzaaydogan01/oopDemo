package entities.concretes;

import entities.abstracts.Entity;

public class Category implements Entity{
	int id;
	String categoryName;
	
	public Category(int id, String categoryName) {
		this.id = id;
		this.categoryName = categoryName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


}
