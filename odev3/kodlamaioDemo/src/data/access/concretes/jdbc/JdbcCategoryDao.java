package data.access.concretes.jdbc;

import java.util.List;

import data.access.abstracts.CategoryDao;
import entities.concretes.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile eklendi : " + category.getCategoryName());
		
	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
