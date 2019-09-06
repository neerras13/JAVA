package com.example.form;


import java.util.LinkedHashMap;

import org.springframework.stereotype.Component;

@Component
public class Student {

private String fname;
private String lname;
private String email;
private String language;
private String country;
LinkedHashMap<String, String> states;
private String[] op;
private String os;

public Student() {
	super();
	states = new LinkedHashMap<String, String>();
	states.put("India","India");
	states.put("US", "US");
	states.put("Canada", "Canada");
	states.put("UK", "UK");
	states.put("France", "France");
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

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public LinkedHashMap<String, String> getStates() {
	return states;
}

public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}

public String[] getOp() {
	return op;
}

public void setOp(String[] op) {
	this.op = op;
}

public String getOs() {
	return os;
}

public void setOs(String os) {
	this.os = os;
}

}
