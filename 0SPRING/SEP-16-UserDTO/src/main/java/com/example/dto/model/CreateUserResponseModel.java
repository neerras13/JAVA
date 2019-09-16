package com.example.dto.model;

public class CreateUserResponseModel {

	private String firstName;
	private String lastName;
	private String email;
	private String userid;
	
	public CreateUserResponseModel() {
		super();
	}
	public CreateUserResponseModel(String firstName, String lastName, String email, String userid) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userid = userid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
