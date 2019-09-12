package com.example.recipe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.recipe.model.Recipe;
import com.example.recipe.repository.IngredientRepository;
import com.example.recipe.repository.NoteRepository;
import com.example.recipe.repository.RecipeRepository;

@Service
public class RecipeServiceImpl implements RecipeService {
	
	private RecipeRepository recipeRepository;
	private IngredientRepository ingredientRepository;
	private NoteRepository noteRepository;
	
	public RecipeServiceImpl() {
		super();
	}

	@Autowired
	public RecipeServiceImpl(RecipeRepository recipeRepository) {
		super();
		this.recipeRepository = recipeRepository;
	}

	@Override
	public List<Recipe> findAll() {

		return recipeRepository.findAll();
		
	}

	@Override
	public void delete(Recipe r) {
		recipeRepository.delete(r);
	}

	@Override
	public void update(List<Recipe> list) {
	}

	@Override
	public Recipe findById(Long id) {

		Optional<Recipe> result = recipeRepository.findById(id);
		Recipe theRecipe=null;
		
		if(result.isPresent())
			theRecipe=result.get();
		return theRecipe;
	}

	

}
