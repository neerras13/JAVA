package com.example.service;

import com.example.model.Word;

public interface WordService {

	public Word getVerb();
	public Word getSubject();
	public Word getNoun();
	public Word getArticle();
	public Word getAdjective();
}
