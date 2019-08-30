package com.ibm.fsd.StudentCRUD.dao;

import com.ibm.fsd.StudentCRUD.model.Student;

public interface StudentDao {
	public void getAllStudents();
	public void updateStudentName(int id,String name);
	public void updateStudentEmail(int id,String email);
	public void updateStudentGrade(int id,String grade);
	public void createStudent(String name,String email,String grade);
	public void deleteStudent(Student st);
	public Student getById(int id);


}
