package com.example.SEP11springjpa.bootstrap;


import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.SEP11springjpa.model.Author;
import com.example.SEP11springjpa.model.Book;
import com.example.SEP11springjpa.model.Publisher;
import com.example.SEP11springjpa.repository.AuthorRepository;
import com.example.SEP11springjpa.repository.BookRepository;
import com.example.SEP11springjpa.repository.PublisherRepository;

@Component
public class DevJpaBootStrap implements ApplicationListener<ContextRefreshedEvent> {

	// no autowire is needed if naming convention is correct and param constructor
	private BookRepository bookRepository;
	private PublisherRepository publisherRepository;
	private AuthorRepository authorRepository;

	public DevJpaBootStrap(BookRepository bookRepository, PublisherRepository publisherRepository,
			AuthorRepository authorRepository) {
		super();
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
		this.authorRepository = authorRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		Publisher publisher = new Publisher();
		publisher.setName("Bloomsbury");
		publisher.setAddress("12th Street, London");
		publisherRepository.save(publisher);

		// JKR
		Author jkr = new Author("JK", "Rowling");
		Book ddd = new Book("Harry Potter", "1234", publisher);
		jkr.getBooks().add(ddd);
		ddd.getAuthors().add(jkr);
		

		authorRepository.save(jkr);
		bookRepository.save(ddd);

		// Rod
		Author rod = new Author("Rod", "Johnson");
		Book noEJB = new Book("J2EE Development without EJB", "23444", publisher);
		rod.getBooks().add(noEJB);
		noEJB.getAuthors().add(rod);

		authorRepository.save(rod);
		bookRepository.save(noEJB);

	}

}