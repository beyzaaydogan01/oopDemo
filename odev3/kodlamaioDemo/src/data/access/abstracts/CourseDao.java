package data.access.abstracts;

import java.util.List;

import entities.concretes.Course;

public interface CourseDao {
	void add(Course course);
	List<Course> getAll();
}
