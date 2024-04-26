package com.ZapitaTech.MixIt.Recipes;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RecipeDAO extends MongoRepository<Recipe, String> {

    List<Recipe> findByNameContaining(String name);

    List<Recipe> findByFlavor(String flavor);

}
