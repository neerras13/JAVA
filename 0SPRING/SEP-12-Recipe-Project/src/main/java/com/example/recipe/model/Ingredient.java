package com.example.recipe.model;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Ingredient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ingredients_id; 
	private String description;
	@ManyToOne
	@JoinColumn(name="recipe_id")
	private Recipe recipe;
	


	public Ingredient(String description, Recipe recipe) {
		super();
		this.description = description;
		this.recipe = recipe;
	}
	public Ingredient(String description) {
		super();
		this.description = description;
	}
	public Ingredient() {
		super();
	}
	public Long getIngredients_id() {
		return ingredients_id;
	}
	public void setIngredients_id(Long ingredients_id) {
		this.ingredients_id = ingredients_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Recipe getRecipe() {
		return recipe;
	}
	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}
	
	
	

}
