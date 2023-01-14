package com.alexgim.cooking.recipe.service;


import com.alexgim.cooking.recipe.data.dto.RecipePostDto;
import com.alexgim.cooking.recipe.data.dto.RecipePutDto;
import com.alexgim.cooking.recipe.data.dto.RecipeResponseDto;

import java.util.List;

public interface RecipeService {
    RecipeResponseDto save(RecipePostDto recipePostDto);

    List<RecipeResponseDto> readAll();

    RecipeResponseDto read(Long id);

    RecipeResponseDto update(Long id, RecipePutDto recipePutDto);

    void delete(Long id);
}
