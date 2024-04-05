package com.ZapitaTech.MixIt.Recipes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/recipes")
public class RecipeController {
    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping(path = "/all")
    public List<Recipe> getAllRecipes(){
        return recipeService.getAllRecipes();
    }

    @GetMapping(path = "/byId/{Id}")
    public Recipe getById(@PathVariable("Id") String id){
        return recipeService.getById(id);
    }

}
