package com.ZapitaTech.MixIt.Recipes;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/recipes")
public class RecipeController {
    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping(path = "/all")
    public List<Recipe> getAllRecipes() {
        return recipeService.getAllRecipes();
    }

    @GetMapping(path = "/byId/{Id}")
    public Recipe getById(@PathVariable("Id") String id) {
        return recipeService.getById(id);
    }

    @GetMapping(path = "/ingredients")
    public List<String> getAllIngredients() {
        List<Recipe> recipes = recipeService.getAllRecipes();
        ArrayList<String> ingredients = new ArrayList<>();
        for (Recipe recipe : recipes) {
            for (String ingredient : recipe.getIngredients()) {
                if (!ingredients.contains(ingredient)) ingredients.add(ingredient);
            }
        }
        return ingredients.stream().sorted().toList();
    }

    @GetMapping(path = "/flavors")
    public Flavor[] getAllFlavours() {
        return Flavor.values();
    }
    @GetMapping(path = "/byName/{name}")
    public List<Recipe> getByName(@PathVariable("name") String name) {
        return recipeService.getByName(name);
    }

    @GetMapping(path = "/byFlavor/{flavor}")
    public List<Recipe> getByFlavor(@PathVariable("flavor") String flavor) {
        return recipeService.getByFlavor(flavor);
    }

    @GetMapping("/byIngredient")
    public List<Recipe> handleRequest(@RequestParam("name") List<String> params) {
        return recipeService.getByIngredients(params);
    }
}
