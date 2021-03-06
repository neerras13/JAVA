package com.example.dto.model;

public class CreateUserRequestModel {
	private String fname;
	private String lname;
	private String email;
	private String password;
	public CreateUserRequestModel(String firstName, String lastName, String email, String password) {
		super();
		this.fname = firstName;
		this.lname = lastName;
		this.email = email;
		this.password = password;
	}
	
	public CreateUserRequestModel() {
		super();
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
