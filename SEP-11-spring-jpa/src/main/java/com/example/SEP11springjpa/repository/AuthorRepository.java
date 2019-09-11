package com.example.SEP11springjpa.repository;
import com.example.SEP11springjpa.model.Author;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
