package data.access.concretes.jdbc;

import java.util.List;

import data.access.abstracts.CourseDao;
import entities.concretes.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile eklendi : " + course.getName());
	}

	@Override
	public List<Course> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
