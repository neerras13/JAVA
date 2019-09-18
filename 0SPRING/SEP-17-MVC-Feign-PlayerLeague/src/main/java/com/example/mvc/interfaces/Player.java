package com.example.mvc.interfaces;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.mvc.data.PlayerDto;

@FeignClient(name="player-service",url="localhost:8762/api/player")
public interface Player {
	
	@RequestMapping(value="/test",method = RequestMethod.GET)
	public String test();
	
	@RequestMapping(value="/players",method =RequestMethod.GET)
	public List<PlayerDto> getAllPlayers();
	
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public PlayerDto createPlayer(@RequestBody PlayerDto dto);
	
	@RequestMapping(value="/find/{id}",method=RequestMethod.GET)
	public PlayerDto findById(@PathVariable("id") Integer id);

}
