package com.example.league.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.league.data.League;
import com.example.league.data.LeagueRepo;
import com.example.league.shared.LeagueDto;
@Service
public class LeagueServiceImpl implements LeagueService {
	
	private LeagueRepo lr;

	@Autowired
	public LeagueServiceImpl(LeagueRepo lr) {
		super();
		this.lr = lr;
	}

	@Override
	public List<LeagueDto> findAllLeagues() {
		ModelMapper mapper= new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

		List<LeagueDto> dlist = new ArrayList<LeagueDto>();
		List<League> list = lr.findAll();
		for(League p:list)
			dlist.add(mapper.map(p,LeagueDto.class));
		
		return dlist;
	}

	@Override
	public LeagueDto findById(Integer league_id) {
		League neww=null;
		ModelMapper mapper= new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Optional<League> l =lr.findById(league_id);
		if(l.isPresent())
			neww=l.get();
		LeagueDto dto = mapper.map(neww,LeagueDto.class);
		
		System.out.println(neww.getName());
		return dto;
	}

	@Override
	public void createLeague(LeagueDto dto) {
	
		ModelMapper mapper= new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		League l = mapper.map(dto,League.class);
		lr.save(l);
	}

}
