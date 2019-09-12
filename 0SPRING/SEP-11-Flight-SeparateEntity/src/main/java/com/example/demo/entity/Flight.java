package com.example.demo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;





@Entity
public class Flight {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long id;
private String name;
private String source;
private String destination;

//@OneToOne
//private Reservation reservation;

@ManyToMany
//@JoinTable(name = "flight_passenger", joinColumns = @JoinColumn(name = "flight_id"),
//inverseJoinColumns = @JoinColumn(name = "passenger_id"))
private Set<Passenger> passengers = new HashSet<>();

public Flight() {
	super();
}


public Flight( String name, String source, String destination) {
	super();
	
	this.name = name;
	this.source = source;
	this.destination = destination;
	
}

public Flight( String name, String source, String destination,Reservation reservation ,Set<Passenger> passengers) {
	super();
	
	this.name = name;
	this.source = source;
	this.destination = destination;
	//this.reservation = reservation;
	this.passengers = passengers;
}

public Long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
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


	/*
	 * public Reservation getReservation() { return reservation; }
	 * 
	 * 
	 * public void setReservation(Reservation reservation) { this.reservation =
	 * reservation; }
	 */


public Set<Passenger> getPassengers() {
	return passengers;
}


public void setPassengers(Set<Passenger> passengers) {
	this.passengers = passengers;
}


@Override
public String toString() {
	return "Flight [id=" + id + ", name=" + name + ", source=" + source + ", destination=" + destination
			+ ", passengers=" + passengers + "]";
}




}
