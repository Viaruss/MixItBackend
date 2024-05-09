package com.ZapitaTech.MixIt.Recipes;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface RecipeDAO extends MongoRepository<Recipe, String> {

    List<Recipe> findByNameContainingIgnoreCase(String name);

    List<Recipe> findByFlavor(Flavor flavor);
    @Query("{'ingredients': {$all: ?0}}")
    List<Recipe> findByIngredients(List<String> ingredients);
}
