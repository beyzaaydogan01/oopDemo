package data.access.concretes.jdbc;

import data.access.abstracts.InstructorDao;
import entities.concretes.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Jdbc ile eklendi : " + instructor.getFirstName() + "" + instructor.getLastName());
		
	}

}
