package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Flight;
import com.example.demo.entity.Passenger;
import com.example.demo.entity.Reservation;
import com.example.demo.repository.FlightRepository;
import com.example.demo.repository.PassengerRepository;
import com.example.demo.repository.ReservationRepository;


@Service
public class PassengerServiceImpl implements PassengerService {
    private PassengerRepository passengerRepository;
    private FlightRepository flightRepository;
    private ReservationRepository reservationRepository;
    @Autowired
    public PassengerServiceImpl(PassengerRepository passengerRepository, FlightRepository flightRepository,
			ReservationRepository reservationRepository) {
		super();
		this.passengerRepository = passengerRepository;
		this.flightRepository = flightRepository;
		this.reservationRepository = reservationRepository;
	}

    
	public PassengerServiceImpl() {
		super();
	}
	
	

	


	@Override
	public List<Passenger> findAllPassengers() {
		
	return passengerRepository.findAll();
	}

	@Override
	public Passenger findById(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Passenger Pass, Flight fl) {
		passengerRepository.save(Pass);
		flightRepository.save(fl);
		
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		
	}





	@Override
	public List<Flight> findAllFlights() {
		
		return (List<Flight>) flightRepository.findAll();
	}


	@Override
	public List<Reservation> findAllReservations() {
		
		return (List<Reservation>) reservationRepository.findAll();
	}

}
