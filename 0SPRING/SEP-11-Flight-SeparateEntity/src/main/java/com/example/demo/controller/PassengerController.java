package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Flight;
import com.example.demo.entity.Passenger;
import com.example.demo.entity.Reservation;
import com.example.demo.service.PassengerService;

@Controller
@RequestMapping("/passenger")
public class PassengerController {
	
	
	private PassengerService passengerService;
	@Autowired
	public PassengerController(PassengerService passengerService) {
		super();
		this.passengerService = passengerService;
	}
	
	public PassengerController() {
		super();
	}
	
	@RequestMapping("/list")
	public String listPassengers(Model theModel) {
		List<Passenger> list=passengerService.findAllPassengers();
		List<Flight> flist=passengerService.findAllFlights();
		List<Reservation> rlist=passengerService.findAllReservations();
		theModel.addAttribute("plist", list);
		theModel.addAttribute("fflist", flist);
		theModel.addAttribute("rrlist", rlist);
		return "passenger/list-form";
	}

	
	@GetMapping("/showFormForAdd")
	
	public String showForm(Model theModel) {
		Passenger p= new Passenger();
		theModel.addAttribute("passenger", p);
		//theModel.addAttribute("flight", f);
		return "passenger/add-form";
	}
	
	@PostMapping("/save")
	
	public String savePassenger(@ModelAttribute("passenger") Passenger p) {
		Flight f= new Flight();
	f.setName(p.getFlight());
	f.setSource(p.getSource());
	f.setDestination(p.getDestination());
     passengerService.save(p, f);
	return "redirect:/passenger/list";
	}
	
}
