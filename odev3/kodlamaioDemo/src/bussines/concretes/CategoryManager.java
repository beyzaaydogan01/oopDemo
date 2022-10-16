package bussines.concretes;

import java.util.ArrayList;
import java.util.List;

import bussines.abstracts.CategoryService;
import core.logging.Logger;
import data.access.abstracts.CategoryDao;
import entities.concretes.Category;

public class CategoryManager implements CategoryService{

	List<Category> categories = new ArrayList<>();

	 private CategoryDao categoryDao;
	 private List<Logger> loggers;
	 
	 public CategoryManager(CategoryDao categoryDao, List<Logger> loggers) {
		 this.categoryDao = categoryDao;
		 this.loggers = loggers;
	 }
	 
	@Override
	public void add(Category category) throws Exception {
		for(Category category1 : categories) {
			if(category.getCategoryName().equals(category1.getCategoryName())) {
				throw new Exception("Kategori ismi tekrar edemez");
			}
		}
		categories.add(category);
		
		for(Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	}
	
	

}
