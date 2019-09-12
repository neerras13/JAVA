package com.example.recipe.service;

import java.util.List;

import com.example.recipe.model.Recipe;

public interface RecipeService {
	
	public List<Recipe> findAll();
	public void delete(Recipe r);
	public Recipe findById(Long id);
	public void update(List<Recipe> list);
	
	
}
