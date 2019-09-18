package com.example.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.model.Word;

@FeignClient("ADJECTIVE")
public interface Adjective {
	
	@GetMapping("/")
	public Word getWord();

}
