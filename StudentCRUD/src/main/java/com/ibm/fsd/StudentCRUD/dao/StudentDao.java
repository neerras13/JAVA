package com.ibm.fsd.StudentCRUD.dao;

import com.ibm.fsd.StudentCRUD.model.Student;

public interface StudentDao {
	public void getAllStudents();
	public void updateStudentName(Student st,String name);
	public void updateStudentEmail(Student st,String email);
	public void updateStudentGrade(Student st,String grade);
	public void createStudent(String name,String email,String grade);
	public void deleteStudent(Student st);
	public Student getById(int id);


}
