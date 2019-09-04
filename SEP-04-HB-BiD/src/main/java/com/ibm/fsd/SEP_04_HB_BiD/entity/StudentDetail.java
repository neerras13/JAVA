package com.ibm.fsd.SEP_04_HB_BiD.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="student_detail")
public class StudentDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String course;
	private String trainer;
	
	@OneToOne(mappedBy="studentDetail", cascade=CascadeType.ALL)
	private Student student;
	public StudentDetail(String course, String trainer) {
		super();
		this.course = course;
		this.trainer = trainer;
	}
	public StudentDetail() {
		super();
	}
	public String getCourse() {
		return course;
	}
	public String getTrainer() {
		return trainer;
	}
	public Student getStudent() {
		return student;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "StudentDetail [id=" + id + ", course=" + course + ", trainer=" + trainer + "]";
	}
	
	
	

}
