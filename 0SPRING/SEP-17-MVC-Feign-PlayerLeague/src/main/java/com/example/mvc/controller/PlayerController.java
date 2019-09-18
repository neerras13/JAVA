package com.example.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.mvc.data.PlayerDto;
import com.example.mvc.interfaces.Player;

@Controller
@RequestMapping("/feign")
public class PlayerController {
	
	@Autowired
	private Player p;
	
	@GetMapping("/Players")
	public ResponseEntity< ? > fetchPlayers(){
		return ResponseEntity.ok(p.getAllPlayers());
	}
	
	@PostMapping("/addPlayers")
	public ResponseEntity<?> createPlayers(@RequestBody PlayerDto dto) {
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(p.createPlayer(dto));
	}
	
	@GetMapping("/find/{id}")
	public String findById(@PathVariable Integer id,Model m){
		PlayerDto dto = p.findById(id);
		m.addAttribute("data", dto);
		return "feign/home";
			
	}
}
