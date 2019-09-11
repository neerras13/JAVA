package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reservation {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)

private Long id;
private String fname;
private String pname;


public Reservation() {
	super();
}




public Reservation(Passenger passenger, Flight flight) {
	super();
	this.id = (long) 1;
	this.fname = flight.getName();
	this.pname=passenger.getFirstName();
}




public String getFname() {
	return fname;
}




public void setFname(String fname) {
	this.fname = fname;
}




public String getPname() {
	return pname;
}




public void setPname(String pname) {
	this.pname = pname;
}




public Long getId() {
	return id;
}




public void setId(Long id) {
	this.id = id;
}







}
