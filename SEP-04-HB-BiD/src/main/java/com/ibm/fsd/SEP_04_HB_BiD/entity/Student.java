package com.ibm.fsd.SEP_04_HB_BiD.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String grade;
//	private int course_id;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="course_id")
	private StudentDetail studentDetail;
	
	public Student() {
		super();
	}
	
	public Student(String name, String email, String grade) {
		super();
		this.name = name;
		this.email = email;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getGrade() {
		return grade;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	


//	public int getCourse_id() {
//		return course_id;
//	}
//
//	public void setCourse_id(int course_id) {
//		this.course_id = course_id;
//	}

	public StudentDetail getStudentDetail() {
		return studentDetail;
	}

	public void setStudentDetail(StudentDetail studentDetail) {
		this.studentDetail = studentDetail;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", grade=" + grade +"]";
	}
	

}
