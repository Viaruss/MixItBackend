package com.ZapitaTech.MixIt.Recipes;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeService {
    private final RecipeDAO recipeDAO;

    public RecipeService(RecipeDAO recipeDAO) {
        this.recipeDAO = recipeDAO;
    }

    public List<Recipe> getAllRecipes() {
        return recipeDAO.findAll();
    }

    public Recipe getById(String id) {
        Optional<Recipe> recipe =  recipeDAO.findById(id);
        return recipe.orElse(null);
    }
    public List<Recipe> getByName(String name) {
        return recipeDAO.findByNameContainingIgnoreCase(name);
    }
    public List<Recipe> getByFlavor(Flavor flavor) {
        return recipeDAO.findByFlavor(flavor);
    }
    public List<Recipe> getByIngredients(List<String> ingredients){
        return recipeDAO.findByIngredients(ingredients);
    }
}
