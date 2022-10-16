package bussines.concretes;

import java.util.ArrayList;
import java.util.List;

import bussines.abstracts.CourseService;
import core.logging.Logger;
import data.access.abstracts.CourseDao;
import entities.concretes.Course;

public class CourseManager implements CourseService{

	List<Course> courses = new ArrayList<>();
	
	private CourseDao courseDao;
	private List<Logger> loggers;
	
	
	public CourseManager(CourseDao courseDao, List<Logger> loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	

	@Override
	public void add(Course course) throws Exception {
		
		for(Course course1 : courses) {
			if(course.getName().equals(course1.getName())) {
				throw new Exception("Kurs ismi tekrar edemez");
			}
		}
		if(course.getPrice()<0) {
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz");
		}
		
		courses.add(course);
		
		for(Logger logger : loggers) {
			logger.log(course.getName());
		}
		
	}
	
}
