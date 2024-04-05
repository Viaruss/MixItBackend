package com.ZapitaTech.MixIt.Recipes;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecipeDAO extends MongoRepository<Recipe, String> {


}
