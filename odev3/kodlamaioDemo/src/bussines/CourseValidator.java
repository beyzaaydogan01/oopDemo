package bussines;

import entities.Course;

public class CourseValidator {
	
	private Course course;
	public CourseValidator(Course course) {
		this.course = course;
	}
	
	public static boolean isValid(Course course) {
		if(course.getPrice()>0) {
			return true;
		}else {
			return false;
		}
	}
	
	

}
