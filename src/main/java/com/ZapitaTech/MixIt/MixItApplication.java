package com.ZapitaTech.MixIt;

import com.ZapitaTech.MixIt.Recipes.RecipeDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MixItApplication {
	final RecipeDAO recipeDAO;
	public MixItApplication(RecipeDAO recipeDAO) {
		this.recipeDAO = recipeDAO;
	}

	public static void main(String[] args) {
		SpringApplication.run(MixItApplication.class, args);
	}
	@Bean
	CommandLineRunner runner() {
		return args -> {
			//testing code here
		};
	}
}
