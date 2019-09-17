package com.example.league.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.league.service.LeagueServiceImpl;
import com.example.league.shared.LeagueDto;

@RestController
@RequestMapping("/")
public class LeagueController {
	private LeagueServiceImpl ls;

	@Autowired
	public LeagueController(LeagueServiceImpl ls) {
		super();
		this.ls = ls;
	}
	
	@GetMapping("/leagues")
	public List<LeagueDto> getAll(){
		return ls.findAllLeagues();
	}
	
	@PostMapping("/add")
	public void createLeague(@RequestBody LeagueDto dto) {
		ls.createLeague(dto);
	}
	
	@GetMapping("/find/{league_id}")
	public LeagueDto findById(@PathVariable("league_id") Integer league_id) {
		return ls.findById(league_id);
	}

}
