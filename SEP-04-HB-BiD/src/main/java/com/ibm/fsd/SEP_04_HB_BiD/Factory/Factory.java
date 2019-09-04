package com.ibm.fsd.SEP_04_HB_BiD.Factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ibm.fsd.SEP_04_HB_BiD.entity.Student;
import com.ibm.fsd.SEP_04_HB_BiD.entity.StudentDetail;


public class Factory {
	public static SessionFactory getSessionFactory()
	{
	SessionFactory factory = new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(Student.class)
			.addAnnotatedClass(StudentDetail.class)
			.buildSessionFactory();
	return factory;
	}
}
