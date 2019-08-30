package com.ibm.fsd.my_first_maven;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="employee")
@Data
@SuppressWarnings("unused")
public class Employee {
	@Id
	@Column(name="id")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;

	private String fname;
	private String lname;
	private String email;
	public Employee(String fname, String lname, String email) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + "]\n";
	}
	

}
