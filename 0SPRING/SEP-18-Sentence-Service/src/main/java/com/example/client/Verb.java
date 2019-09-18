package com.example.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.model.Word;

@FeignClient("VERB")
public interface Verb {
	
	@GetMapping("/")
	public Word getWord();

}
