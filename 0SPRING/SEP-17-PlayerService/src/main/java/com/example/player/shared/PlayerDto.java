package com.example.player.shared;

public class PlayerDto {
	private String fname;
	private String lname;
	private String position;
	private String email;
	public PlayerDto() {
		super();
	}
	public PlayerDto(String fname, String lname, String position, String email) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.position = position;
		this.email = email;
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
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
