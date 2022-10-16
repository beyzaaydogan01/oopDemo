package data.access.concretes.hibernate;

import java.util.List;

import data.access.abstracts.CourseDao;
import entities.concretes.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile eklendi : " + course.getName());
		
	}

	@Override
	public List<Course> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
