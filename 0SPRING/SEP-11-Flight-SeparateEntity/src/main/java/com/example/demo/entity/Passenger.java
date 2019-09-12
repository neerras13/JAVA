package com.example.demo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;



@Entity
public class Passenger {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long id;
private String firstName;
private String lastName;
private String flight;
private String source;
private String destination;



@ManyToMany(mappedBy = "passengers")
private Set<Flight> flights  = new HashSet<>();

public Passenger() {
	super();
}


public long getId() {
	return id;
}


public void setId(long id) {
	this.id = id;
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


public String getFlight() {
	return flight;
}


public void setFlight(String flight) {
	this.flight = flight;
}




public String getSource() {
	return source;
}


public void setSource(String source) {
	this.source = source;
}


public String getDestination() {
	return destination;
}


public void setDestination(String destination) {
	this.destination = destination;
}


public Set<Flight> getFlights() {
	return flights;
}


public void setFlights(Set<Flight> flights) {
	this.flights = flights;
}



public Passenger( String firstName, String lastName, String flight, String source, String destination,
		Set<Flight> flights) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.flight = flight;
	this.source = source;
	this.destination = destination;
	this.flights = flights;
}



public Passenger(String firstName, String lastName) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
}


@Override
public String toString() {
	return "Passenger [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ",  flights=" + flights + "]";
}


}
