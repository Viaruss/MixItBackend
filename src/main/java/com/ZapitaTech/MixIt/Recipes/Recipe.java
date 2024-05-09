package com.ZapitaTech.MixIt.Recipes;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Getter
@Setter
@Document

public class Recipe {
    @Id
    private String id;
    private String name;
    private Flavor flavor;
    private String baseAlcohol;
    private List<String> ingredients;
    private int strength;
    private String howToMake;
    private int rating;
    private String imageUrl;

    public Recipe() {
    }

    public Recipe(String name, Flavor flavor, String baseAlcohol, List<String> ingredients, int strength, String howToMake, int rating, String imageUrl) {
        this.name = name;
        this.flavor = flavor;
        this.baseAlcohol = baseAlcohol;
        this.ingredients = ingredients;
        this.strength = strength;
        this.howToMake = howToMake;
        this.rating = rating;
        this.imageUrl = imageUrl;
    }
}
