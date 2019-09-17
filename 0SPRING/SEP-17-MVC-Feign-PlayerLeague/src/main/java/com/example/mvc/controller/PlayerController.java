package com.example.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	public void createPlayers(PlayerDto dto) {
		p.createPlayer(dto);
	}
	
	@PostMapping("/find/{id}")
	public ResponseEntity<?> findById(Integer id){
		return ResponseEntity.ok(p.findById(id));
				
	}
}
