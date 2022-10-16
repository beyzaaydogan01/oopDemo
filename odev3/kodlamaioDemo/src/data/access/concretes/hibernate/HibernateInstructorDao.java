package data.access.concretes.hibernate;

import data.access.abstracts.InstructorDao;
import entities.concretes.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile eklendi : " + instructor.getFirstName() + "" + instructor.getLastName());
		
	}

}
