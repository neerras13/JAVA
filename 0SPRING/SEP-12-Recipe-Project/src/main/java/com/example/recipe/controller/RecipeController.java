package com.example.recipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.recipe.model.Ingredient;
import com.example.recipe.model.Note;
import com.example.recipe.model.Recipe;
import com.example.recipe.service.RecipeServiceImpl;

@Controller
@RequestMapping("/recipes")
public class RecipeController {

	@Autowired
	private RecipeServiceImpl rs;
	
	@GetMapping("/display")
	public String goHome(Model theModel) {
		List<Recipe> list=rs.findAll();
		theModel.addAttribute("recipe",list);
		return "/recipes/view";
	}
	
//	@RequestMapping("/showRecipes")
//	public String viewRecipes(@RequestParam("id") Integer id,Model theModel) {
//		
//		Recipe r=rs.getRecipeById(id);
//		Ingredient i=r.getIngred();
//		Note n=r.getNote();
//		theModel.addAttribute("recipe",r);
//		theModel.addAttribute("ingre",i);
//		theModel.addAttribute("note",n);
//		return "receipe/view";
//	}
//	
//	@RequestMapping("/delete")
//	public String deleteRecipe(@RequestParam("id") Integer id) {
//		rs.deleteRecipe(id);
//		return "redirect:/recipe/display";
//	}
}
