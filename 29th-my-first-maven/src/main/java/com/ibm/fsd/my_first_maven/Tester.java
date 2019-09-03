package com.ibm.fsd.my_first_maven;


import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Tester {

	public static void main(String[] args) {
		try {
			SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
			Session session = factory.openSession();
			Employee e = new Employee("John","Doe","john@gg.com");
			session.getTransaction().begin();
			int a = (int) session.save(e);
			if (a>0)
				System.out.println("Inserted 1 row!");
			session.getTransaction().commit();
			
			Query query = session.createQuery("from Employee");
			@SuppressWarnings("unchecked")
			List<Employee> list = query.getResultList();
			for(Employee emp:list) {
				System.out.println(emp);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
