package com.example.dto.model;

public class CreateUserResponseModel {

	private String fname;
	private String lname;
	private String email;
	private String userid;
	
	public CreateUserResponseModel() {
		super();
	}
	public CreateUserResponseModel(String firstName, String lastName, String email, String userid) {
		super();
		this.fname = firstName;
		this.lname = lastName;
		this.email = email;
		this.userid = userid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String firstName) {
		this.fname = firstName;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lastName) {
		this.lname = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
}
