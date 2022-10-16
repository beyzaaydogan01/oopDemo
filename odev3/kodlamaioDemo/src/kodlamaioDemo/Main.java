package kodlamaioDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.CheckedOutputStream;

import bussines.concretes.CategoryManager;
import bussines.concretes.CourseManager;
import bussines.concretes.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import data.access.abstracts.CategoryDao;
import data.access.abstracts.CourseDao;
import data.access.abstracts.InstructorDao;
import data.access.concretes.hibernate.HibernateCategoryDao;
import data.access.concretes.hibernate.HibernateCourseDao;
import data.access.concretes.jdbc.JdbcCourseDao;
import data.access.concretes.jdbc.JdbcInstructorDao;
import entities.concretes.Category;
import entities.concretes.Course;
import entities.concretes.Instructor;

public class Main {
	public static void main(String[] args) throws Exception {
		
		List<Logger> loggers = new ArrayList<>(Arrays.asList(new DatabaseLogger(), new FileLogger(), new MailLogger()));
		
		Course course1 = new Course(1,"Java Yazılım Geliştirici",10,"Programlama","Java programlama dili");
		Course course2 = new Course(2,"Java Yazılım Geliştirici",10,"Programlama","C# programlama dili");
		Course course3 = new Course(3,"Javascript Yazılım Geliştirici",-10,"Programlama","C# programlama dili");
			
		CourseDao courseDao = new JdbcCourseDao();
		courseDao.add(course1);
		
		CourseManager courseManager = new CourseManager(courseDao, loggers);
		courseManager.add(course1);
		//courseManager.add(course2);  Kurs ismi tekrar edemez
		//courseManager.add(course3);  Kurs fiyatı 0'dan küçük olamaz
		
		Category category1 = new Category(1, "Programlama");
		Category category2 = new Category(1, "Programlama");
		
		CategoryDao categoryDao = new HibernateCategoryDao();
		categoryDao.add(category1);
		
		CategoryManager categoryManager = new CategoryManager(categoryDao, loggers);
		categoryManager.add(category1);
		//categoryManager.add(category2);  Kategori ismi tekrar edemez
		
		Instructor instructor = new Instructor(1, "Engin", "Demiroğ", 35);
		
		InstructorDao instructorDao = new JdbcInstructorDao();
		instructorDao.add(instructor);
		
		InstructorManager instructorManager = new InstructorManager(instructorDao, loggers);
		instructorManager.add(instructor);
		
	}
}
