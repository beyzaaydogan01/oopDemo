package bussines.concretes;

import java.util.ArrayList;
import java.util.List;

import bussines.abstracts.InstructorService;
import core.logging.Logger;
import data.access.abstracts.InstructorDao;
import entities.concretes.Instructor;

public class InstructorManager implements InstructorService{

	List<Instructor> instructors = new ArrayList<>();
	
	private InstructorDao instructorDao;
	private List<Logger> loggers;
	
	public InstructorManager(InstructorDao instructorDao, List<Logger> loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	@Override
	public void add(Instructor instructor) throws Exception {
		instructors.add(instructor);
		
		for (Logger logger : loggers) {
			logger.log(instructor.getFirstName() + "" + instructor.getLastName());
		}
	}

}
