package com.example.player.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
		pserv.createPlayer(dto);
	}
	
	@GetMapping("/find/{id}")
	public PlayerDto findById(@PathVariable("id") Integer id) {
		return pserv.findById(id);
	}
	
	@PostMapping("/delete")
	public void deleteplayer(@RequestParam("email") String email) {
		System.out.println(email);
		pserv.deleteplayer(email);
	}
	
	@PostMapping("/update")
	public PlayerDto updateplayer(@RequestParam("email") String email, @RequestBody PlayerDto dto) {
		return pserv.updateplayer(email, dto);
		
	}
	
	@PostMapping("/findEmail")
	public PlayerDto findByEmail(@RequestParam("email") String email) {
		return pserv.findByEmail(email);
	}
}
