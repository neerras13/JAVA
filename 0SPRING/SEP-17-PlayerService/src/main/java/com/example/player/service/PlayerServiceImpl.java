package com.example.player.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.example.player.data.Player;
import com.example.player.data.PlayerRepo;
import com.example.player.shared.PlayerDto;
@Service
public class PlayerServiceImpl implements PlayerService {

	private Environment env;
	private PlayerRepo pr;
	
	@Autowired
	public PlayerServiceImpl(Environment env, PlayerRepo pr) {
		super();
		this.env = env;
		this.pr = pr;
	}

	@Override
	public List<PlayerDto> getAll() {
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		List<PlayerDto> dlist = new ArrayList<PlayerDto>();
		List<Player> list = pr.findAll();
		for(Player p:list)
			dlist.add(mapper.map(p,PlayerDto.class));
		
		return dlist;
	}

	@Override
	public PlayerDto findById(Integer id) {
		Player p=null;
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Optional<Player> op = pr.findById(id);
		if(op.isPresent())
			p = op.get();
		PlayerDto pd = mapper.map(p,PlayerDto.class);
		return pd;
	}

	@Override
	public PlayerDto createPlayer(PlayerDto pdto) {
		System.out.println("check");
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		Player play = mapper.map(pdto,Player.class);
		pr.save(play);
		
		return pdto;
	}

	@Override
	public void deleteplayer(String email) {
		Player play = new Player();
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Optional<Player> op = pr.findByEmail(email);
		if(op.isPresent())
			play = op.get();
		pr.delete(play);
	}

	@Override
	public PlayerDto updateplayer(String email,PlayerDto dto) {
		Player play = new Player();
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Optional<Player> op = pr.findByEmail(email);
		if(op.isPresent())
			play = op.get();
		play.setFname(dto.getFname());
		play.setLname(dto.getLname());
		play.setPosition(dto.getPosition());
		
		pr.save(play);
		
		PlayerDto pd = mapper.map(play,PlayerDto.class);
		return pd;
	}

	@Override
	public PlayerDto findByEmail(String email) {
		Player play = new Player();
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Optional<Player> op = pr.findByEmail(email);
		if(op.isPresent())
			play = op.get();
		PlayerDto pd = mapper.map(play,PlayerDto.class);
		return pd;
	}

}
