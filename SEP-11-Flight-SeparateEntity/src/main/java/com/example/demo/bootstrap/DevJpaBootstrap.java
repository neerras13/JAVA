package com.example.demo.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Flight;
import com.example.demo.entity.Passenger;
import com.example.demo.entity.Reservation;
import com.example.demo.repository.FlightRepository;
import com.example.demo.repository.PassengerRepository;
import com.example.demo.repository.ReservationRepository;


@Component
public class DevJpaBootstrap implements ApplicationListener<ContextRefreshedEvent>{
	private FlightRepository flightRepository;
	private PassengerRepository passengerRepository;
	private ReservationRepository reservationRepository;

	

	

	public DevJpaBootstrap(FlightRepository flightRepository, PassengerRepository passengerRepository,
			ReservationRepository reservationRepository) {
		super();
		this.flightRepository = flightRepository;
		this.passengerRepository = passengerRepository;
		this.reservationRepository = reservationRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		init();
	}


	private void init() {
		
	Flight fl = new Flight("jetairways", "blr","delhi");
	Passenger p = new Passenger("john", "tom");
	Reservation res= new Reservation(p,fl);
	
		fl.getPassengers().add(p);
		p.getFlights().add(fl);
		passengerRepository.save(p);
		flightRepository.save(fl);
		
		reservationRepository.save(res);
		
	}



	
}
