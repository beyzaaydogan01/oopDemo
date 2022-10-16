package data.access.concretes.hibernate;

import java.util.List;

import data.access.abstracts.CategoryDao;
import entities.concretes.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile eklendi : " + category.getCategoryName());
		
	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
