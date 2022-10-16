package data.access.abstracts;

import java.util.List;

import entities.concretes.Category;

public interface CategoryDao {
	void add(Category category);
	List<Category> getAll();

}
