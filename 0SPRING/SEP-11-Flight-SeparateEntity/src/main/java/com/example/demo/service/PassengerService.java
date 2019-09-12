package com.example.demo.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Flight;
import com.example.demo.entity.Passenger;
import com.example.demo.entity.Reservation;

public interface PassengerService   {
public List<Passenger> findAllPassengers();
public List<Flight> findAllFlights();
public List<Reservation> findAllReservations();
	
	public Passenger findById(int theId);
	
	public void save(Passenger Pass,Flight fl);
	
	public void deleteById(int theId);
}
