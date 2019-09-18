package com.example.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.model.Word;

@FeignClient("NOUN")
public interface Noun {
	
	@GetMapping("/")
	public Word getWord();

}
