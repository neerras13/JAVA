package com.example;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Word;

@RestController
public class AppController {

	 private final Random random = new Random();
		
		@Value("${words}") String[] words;
		
		@GetMapping("/")
		public Word getWord() {
			return new Word(words[random.nextInt(words.length)]);
		}
}
