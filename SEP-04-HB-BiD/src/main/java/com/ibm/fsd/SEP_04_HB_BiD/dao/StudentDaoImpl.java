package com.ibm.fsd.SEP_04_HB_BiD.dao;

import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ibm.fsd.SEP_04_HB_BiD.Factory.Factory;
import com.ibm.fsd.SEP_04_HB_BiD.entity.Student;
import com.ibm.fsd.SEP_04_HB_BiD.entity.StudentDetail;


public class StudentDaoImpl implements StudentDao{
	


	SessionFactory factory = Factory.getSessionFactory();
	Session s = factory.openSession();

	@Override
	public void getAllStudents() {
		System.out.println("Displaying all students... \n");
		Query query = s.createQuery("from Student");
		@SuppressWarnings("unchecked")
		List<Student> list = query.getResultList();
		for(Student s:list)
			System.out.println(s);	
	}

	@Override
	public void updateStudentName(Student st,String name) {
		s.getTransaction().begin();
		if(st != null) {
			st.setName(name);
			s.merge(st);
		}
		s.getTransaction().commit();

	}

	@Override
	public void createStudent(String name, String email,String grade,int course_id) 
	{
		Student st =new Student(name,email,grade);
		StudentDetail sd = new StudentDetail("FSD","Admin");
		st.setStudentDetail(sd);
		s.getTransaction().begin();
     int a = (int) s.save(st);
     if(a>0)
    	 System.out.println("Inserted one row!");
	s.getTransaction().commit();

	}

	@Override
	public synchronized void deleteStudent(Student st) {
		Transaction tx=s.getTransaction();
		tx.begin();
		s.delete(st);
		tx.commit();
		
	}

	@Override
	public Student getById(int id) {
		s.getTransaction().begin();
		Student st = s.get(Student.class,id);
		s.getTransaction().commit();
		return st;
	}

	@Override
	public void updateStudentEmail(Student st,String email) {
		s.getTransaction().begin();
		if(st != null) {
			st.setEmail(email);
			s.merge(st);
		}
		s.getTransaction().commit();		
	}

	@Override
	public void updateStudentGrade(Student st, String grade) {
		s.getTransaction().begin();
		if(st != null) {
			st.setGrade(grade);
			s.merge(st);
		}
		s.getTransaction().commit();		
	}
	

}
