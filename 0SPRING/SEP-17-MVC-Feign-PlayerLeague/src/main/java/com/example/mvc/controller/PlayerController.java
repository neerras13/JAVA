package com.example.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.mvc.data.PlayerDto;
import com.example.mvc.interfaces.Player;

@Controller
@RequestMapping("/feign")
public class PlayerController {
	
	@Autowired
	private Player p;
	
	@GetMapping("/Players")
	public String fetchPlayers(Model m){
		List<PlayerDto> list = p.getAllPlayers();
		m.addAttribute("players",list);
		return "feign/players";
	}
	
	@PostMapping("/addPlayer")
	public String createPlayers(@ModelAttribute PlayerDto dto) {
		p.createPlayer(dto);
		return "redirect:/feign/Players";
	}
	
	@PostMapping("/delete")
	public String delete(@RequestParam("email") String email) {
		System.out.println(email);
		p.deleteplayer(email);
		return "redirect:/feign/Players";
	}
	
	@GetMapping("/add")
	public String addForm(Model m)
	{
		PlayerDto dto = new PlayerDto();
		m.addAttribute("dto", dto);
		return "feign/addForm";
	}
	@GetMapping("/find/{id}")
	public String findById(@PathVariable Integer id,Model m){
		PlayerDto dto = p.findById(id);
		m.addAttribute("data", dto);
		return "feign/home";
			
	}
	
	@PostMapping("/update")
	public String edit(@RequestParam("email") String email, Model m)
	{
		PlayerDto dto = p.findByEmail(email);
		m.addAttribute("dto", dto);
		return "feign/editForm";
	}
	
	@PostMapping("/updatePlayer")
	public String editPlayer(@ModelAttribute PlayerDto dto, @RequestParam("email") String email) {
		p.updateplayer(dto, email);
		return "redirect:Players";
	}
}
