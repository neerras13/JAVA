package com.ibm.fsd.StudentCRUD.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ibm.fsd.StudentCRUD.model.Student;

public class Factory {
	public static SessionFactory getSessionFactory()
	{
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
	return factory;
	}
}
