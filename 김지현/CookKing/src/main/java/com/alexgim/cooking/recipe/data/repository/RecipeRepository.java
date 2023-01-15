package com.alexgim.cooking.recipe.data.repository;

import com.alexgim.cooking.recipe.data.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
