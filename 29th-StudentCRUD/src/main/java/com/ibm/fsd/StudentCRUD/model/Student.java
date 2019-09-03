package com.ibm.fsd.StudentCRUD.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Setter;

@Entity
@Table(name="stud")
public class Student {
@Id
private int id;
private String name;
private String email;
private String grade;
public Student() {
	super();
}
public Student(String name, String email, String grade) {
	super();
	this.name = name;
	this.email = email;
	this.grade = grade;
}
@Override
public String toString() {
	return "id=" + id + " name=" + name + " email=" + email + " grade=" + grade + "\n";
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


}
