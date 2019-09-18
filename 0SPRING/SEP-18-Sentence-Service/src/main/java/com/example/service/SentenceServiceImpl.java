package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SentenceServiceImpl implements SentenceService {

	@Autowired
	private WordServiceImpl wordService;
	
	@Override
		public String buildSentence() {
			return  
				String.format("%s %s %s %s %s.",
					wordService.getSubject().getString(),     //get Word object and then getWord()
					wordService.getVerb().getString(),
					wordService.getArticle().getString(),
					wordService.getAdjective().getString(),
					wordService.getNoun().getString() )
				;
		}	
}
