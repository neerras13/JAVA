package com.ibm.fsd.StudentCRUD.service;

import com.ibm.fsd.StudentCRUD.dao.StudentDaoImpl;
import com.ibm.fsd.StudentCRUD.model.Student;

public class StudentServiceImpl implements StudentService{

	StudentDaoImpl dao = new StudentDaoImpl();
	@Override
	public void getAllStudents() {
		dao.getAllStudents();
	}

	@Override
	public void updateStudentName(int id, String name) {
		dao.updateStudentName(id, name);
	}

	@Override
	public void updateStudentEmail(int id, String email) {
		dao.updateStudentEmail(id, email);
	}

	@Override
	public void updateStudentGrade(int id, String grade) {
		dao.updateStudentGrade(id, grade);
	}

	@Override
	public void createStudent(String name,String email,String grade) {
		dao.createStudent(name, email, grade);
	}

	@Override
	public void deleteStudent(Student st) {
		dao.deleteStudent(st);
	}

	@Override
	public Student getById(int id) {
		Student st = dao.getById(id);
		return st;
	}

}
