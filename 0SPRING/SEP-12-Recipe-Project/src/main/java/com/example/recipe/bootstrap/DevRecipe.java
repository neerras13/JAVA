package com.example.recipe.bootstrap;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Controller;

import com.example.recipe.model.Ingredient;
import com.example.recipe.model.Note;
import com.example.recipe.model.Recipe;
import com.example.recipe.repository.IngredientRepository;
import com.example.recipe.repository.NoteRepository;
import com.example.recipe.repository.RecipeRepository;

@Controller
public class DevRecipe implements ApplicationListener<ContextRefreshedEvent>{

	private RecipeRepository recipeRepository;
	private IngredientRepository ingredientRepository;
	private NoteRepository noteRepository;
	
	@Autowired
	public DevRecipe(RecipeRepository recipeRepository, IngredientRepository ingredientRepository,
			NoteRepository noteRepository) {
		super();
		this.recipeRepository = recipeRepository;
		this.ingredientRepository = ingredientRepository;
		this.noteRepository = noteRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		init();
	}
	
	public void init() {
		Recipe rec = new Recipe(
				"Brownie",
				"30 mins", 
				"Easy",
				"A 7×11-inch pan yielded thicker brownies (about 2-inches thick), baked for 40-45 minutes and slightly uneven in consistency (fudgier in the centre and set around the edges).\r\n",// + 
				//"An 8×12-inch pan yielded the perfect brownies and MY personal favourite (just over 1-inch thick), baked for just under 25 minutes and resulted in just the right thickness and consistency, while still ooey, gooey and chewy.\r\n" + 
				//"A 9×13-inch pan resulted in thinner brownies (about 3/4 of an inch) and even consistency throughout. Baked for around 18 minutes. Perfect texture but I prefer slightly thicker pieces.",
				"15 min",
				"4",
				"CafeDelites", 
				"https://cafedelites.com/worlds-best-fudgiest-brownies/");
		List<Ingredient> list = new ArrayList<Ingredient>(); 
			list.add(0,new Ingredient("1/2 cup unsalted butter, melted"));
			list.add(1,new Ingredient("chilli pepper"));
			list.add(2,new Ingredient("1 tablespoon cooking oil, (olive oil or coconut oil are fine)"));
			list.add(3,new Ingredient("1 1/8 cup superfine sugar, (caster sugar or white granulated sugar)"));
			list.add(4,new Ingredient("2 large eggs\r\n"));
			list.add(5,new Ingredient("2 teaspoons pure vanilla extract\r\n"));
			list.add(6,new Ingredient("1/2 cup all purpose (or plain) flour\r\n"));
			list.add(7,new Ingredient("1/2 cup unsweetened cocoa powder\r\n"));
			list.add(8,new Ingredient("1/4 teaspoon salt"));
		
					
		Note n = new Note("An 8×12-inch pan yielded the perfect brownies and MY personal favourite (just over 1-inch thick), baked for just under 25 minutes and resulted in just the right"); //thickness and consistency, while still ooey, gooey and chewy.\r\n");
		
		Ingredient ing1 = new Ingredient("1/2 cup unsalted butter, melted");
		Ingredient ing2 = new Ingredient("2 teaspoons pure vanilla extract");
		ing1.setRecipe(rec);
		ing2.setRecipe(rec);
		n.setRecipe(rec);
		rec.getIngredients().add(ing1);
		rec.getIngredients().add(ing2);
		rec.setNotes(n);
		
		recipeRepository.save(rec);
		ingredientRepository.save(ing1);
		ingredientRepository.save(ing2);
		noteRepository.save(n);
	}
       
}
