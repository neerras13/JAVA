package com.example.recipe.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.aspectj.bridge.AbortException;

import lombok.Data;

@Entity
@Data
public class Recipe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String cookTime;
	private String difficulty;
	private String direction;
	private String prepTime;
	private String servings;
	private String source;
	private String url;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "notes_id")
	private Note notes;
	@OneToMany(mappedBy="recipe")
	private List<Ingredient> ingredients= new ArrayList<Ingredient>();
	
	
	public Recipe() {
		super();
	}
	

	public Recipe(String name, String cookTime, String difficulty, String direction, String prepTime, String servings,
			String source, String url) {
		super();
		this.name = name;
		this.cookTime = cookTime;
		this.difficulty = difficulty;
		this.direction = direction;
		this.prepTime = prepTime;
		this.servings = servings;
		this.source = source;
		this.url = url;
		
	}




	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCookTime() {
		return cookTime;
	}

	public void setCookTime(String cookTime) {
		this.cookTime = cookTime;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getPrepTime() {
		return prepTime;
	}

	public void setPrepTime(String prepTime) {
		this.prepTime = prepTime;
	}

	public String getServings() {
		return servings;
	}

	public void setServings(String servings) {
		this.servings = servings;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}


	public Note getNotes() {
		return notes;
	}


	public void setNotes(Note notes) {
		this.notes = notes;
	}


	public List<Ingredient> getIngredients() {
		return ingredients;
	}


	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

}
