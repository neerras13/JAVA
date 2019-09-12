package com.example.recipe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.recipe.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
