package com.ibm.fsd.SEP_04_HB_BiD.dao;

import com.ibm.fsd.SEP_04_HB_BiD.entity.Student;

public interface StudentDao {
	public void getAllStudents();
	public void updateStudentName(Student st,String name);
	public void updateStudentEmail(Student st,String email);
	public void updateStudentGrade(Student st,String grade);
	public void createStudent(String name,String email,String grade,int course_id);
	public void deleteStudent(Student st);
	public Student getById(int id);


}
