package kodlamaioDemo;

import bussines.CourseManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import data.access.CourseDao;
import data.access.HibernateCourseDao;
import data.access.JdbcCourseDao;
import entities.Course;

public class Main {
	public static void main(String[] args) {
		Course course1 = new Course("Java Yazılım Geliştirici",10,"Programlama","Java programlama dili");
		Course course2 = new Course("C# Yazılım Geliştirici",10,"Programlama","C# programlama dili");
	
		Logger[] loggers = {new DatabaseLogger(),new MailLogger(), new FileLogger()};
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course1);
		courseManager.add(course2);
		
		
	}
}
