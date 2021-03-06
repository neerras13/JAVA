package com.example.dto.controller;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.model.CreateUserRequestModel;
import com.example.dto.model.CreateUserResponseModel;
import com.example.dto.service.UserService;
import com.example.dto.shared.UserDto;

@RestController
@RequestMapping("/")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/users")
	public ResponseEntity<CreateUserResponseModel> create(@RequestBody CreateUserRequestModel userDetail)
	{
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		UserDto uDto=mapper.map(userDetail, UserDto.class);
		
		UserDto tempDto=userService.createUser(uDto);
		CreateUserResponseModel model=mapper.map(tempDto, CreateUserResponseModel.class);
		System.out.println(model.getFname());
		return ResponseEntity.status(HttpStatus.CREATED).body(model);

	}

}
