package bussines;

import java.util.Iterator;

import core.logging.Logger;
import data.access.CourseDao;
import entities.Course;
import java.util.List;
public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) {
		if(CourseValidator.isValid(course)) {
			courseDao.add(course);
		}else {
			System.out.println("Geçersiz kurs bilgileri");
		}
		
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
		
	}
	
}
