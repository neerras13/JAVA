package com.example.league.service;

import java.util.List;

import com.example.league.shared.LeagueDto;

public interface LeagueService {

	public List<LeagueDto> findAllLeagues();
	public LeagueDto findById(Integer league_id);
	public void createLeague(LeagueDto dto);
}
