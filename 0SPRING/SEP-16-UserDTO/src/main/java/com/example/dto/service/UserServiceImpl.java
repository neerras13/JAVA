package com.example.dto.service;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.dto.data.*;
import com.example.dto.shared.UserDto;

@Service
public class UserServiceImpl implements UserService {
	private Environment env;
	private UserRepo userRepository;

	private BCryptPasswordEncoder bCryptPasswordEncoder;
	@Autowired
	public UserServiceImpl(Environment env, UserRepo userRepository,
			BCryptPasswordEncoder bCryptPasswordEncoder) {
		super();
		this.env = env;
		this.userRepository = userRepository;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}

	@Override
	public UserDto createUser(UserDto userDetail) {
		// TODO Auto-generated method stub
		userDetail.setUserid(UUID.randomUUID().toString());
		String bPass=bCryptPasswordEncoder.encode(userDetail.getPassword());
		userDetail.setBpassword(bCryptPasswordEncoder.encode(userDetail.getPassword()));
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		UserEntity userEntity=mapper.map(userDetail, UserEntity.class);
		userEntity.setPassword(userDetail.getBpassword());
		userRepository.save(userEntity);
		UserDto uDto=mapper.map(userEntity, UserDto.class);
		
		return uDto;
	}



}

