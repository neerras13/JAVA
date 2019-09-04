package com.myapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.myapp.entity.Instructor;
import com.myapp.factory.InstructorFactory;

public class InstructorDAOImpl implements InstructorDAO {
	
	private static Session session=null;
	{
		session=InstructorFactory.getMySession();
	}

	public void createInstructor(Instructor instructor) {
		
		session.getTransaction().begin();
		session.persist(instructor);
		session.getTransaction().commit();
	}



}
