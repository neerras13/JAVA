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
	public void updateStudentName(Student st, String name) {
		dao.updateStudentName(st, name);
	}

	@Override
	public void updateStudentEmail(Student st, String email) {
		dao.updateStudentEmail(st, email);
	}

	@Override
	public void updateStudentGrade(Student st, String grade) {
		dao.updateStudentGrade(st, grade);
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
