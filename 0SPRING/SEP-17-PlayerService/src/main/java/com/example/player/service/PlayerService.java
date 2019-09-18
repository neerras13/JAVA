package com.example.player.service;

import java.util.List;

import com.example.player.shared.PlayerDto;

public interface PlayerService {

	public List<PlayerDto> getAll();
	public PlayerDto findById(Integer id);
	public PlayerDto createPlayer(PlayerDto pdto);
}
