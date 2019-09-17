package com.example.player.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.player.service.PlayerServiceImpl;
import com.example.player.shared.PlayerDto;

@RestController
@RequestMapping("/")
public class PlayerController {
	
	private PlayerServiceImpl pserv;
	@Autowired
	public PlayerController(PlayerServiceImpl pserv) {
		super();
		this.pserv = pserv;
	}

	@GetMapping("/test")
	public String test() {
		return "All ok!";
	}
	
	@GetMapping("/players")
	public List<PlayerDto> getAllPlayers(){
		return pserv.getAll();
	}
	
	@PostMapping("/add")
	public void createPlayer(@RequestBody PlayerDto dto) {
		System.out.println(dto.getFname()+dto.getLname()+dto.getPosition()+dto.getEmail());
		pserv.createPlayer(dto);
	}
	
	@PostMapping("/find/{id}")
	public PlayerDto findById(@PathVariable("id") Integer id) {
		return pserv.findById(id);
	}
}
