package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.client.Adjective;
import com.example.client.Article;
import com.example.client.Noun;
import com.example.client.Subject;
import com.example.client.Verb;
import com.example.model.Word;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@Service
public class WordServiceImpl implements WordService{

	@Autowired private Adjective ad;
	@Autowired private Article ar;
	@Autowired private Noun no;
	@Autowired private Subject su;
	@Autowired private Verb ve;
	
	@Override
	@HystrixCommand(fallbackMethod = "getVerbF")
	public Word getVerb() {
		return ve.getWord();
	}
	@Override
	@HystrixCommand(fallbackMethod = "getSubjectF")
	public Word getSubject() {
		// TODO Auto-generated method stub
		return su.getWord();
	}
	@Override
	@HystrixCommand(fallbackMethod = "getNounF")
	public Word getNoun() {
		// TODO Auto-generated method stub
		return no.getWord();
	}
	@Override
	public Word getArticle() {
		// TODO Auto-generated method stub
		return ar.getWord();
	}
	@Override
	public Word getAdjective() {
		// TODO Auto-generated method stub
		return ad.getWord();
	}
	
	public Word getVerbF() {
		return new Word("Verb");
	}
	public Word getSubjectF() {
		return new Word("Subject");
	}
	public Word getNounF() {
		return new Word("Noun");
	}
	
	
	
}
