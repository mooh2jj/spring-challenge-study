package com.alexgim.cooking.recipe.service.impl;

import com.alexgim.cooking.recipe.data.dto.RecipePostDto;
import com.alexgim.cooking.recipe.data.dto.RecipePutDto;
import com.alexgim.cooking.recipe.data.dto.RecipeResponseDto;
import com.alexgim.cooking.recipe.data.entity.Recipe;
import com.alexgim.cooking.recipe.data.repository.RecipeRepository;
import com.alexgim.cooking.recipe.service.RecipeService;
import com.alexgim.cooking.user.data.entity.User;
import com.alexgim.cooking.user.data.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;
    private final UserRepository userRepository;

    @Override
    public RecipeResponseDto save(RecipePostDto recipePostDto) {
        User user = userRepository.findById(recipePostDto.getUserId()).orElse(null);

        Recipe recipe = Recipe.builder()
                .user(user)
                .title(recipePostDto.getTitle())
                .content(recipePostDto.getContent())
                .img(recipePostDto.getImg())
                .category(recipePostDto.getCategory())
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .status(0)
                .build();

        String name = recipe.getUser().getNickname();

        return RecipeResponseDto.builder()
                .name(name)
                .title(recipe.getTitle())
                .content(recipe.getContent())
                .img(recipe.getImg())
                .category(recipe.getCategory())
                .createdAt(recipe.getCreatedAt())
                .build();
    }

    @Override
    public List<RecipeResponseDto> readAll() {
        List<Recipe> recipe = recipeRepository.findAll();
        List<RecipeResponseDto> recipeResponseDtoList = new ArrayList<>();

        for(Recipe r : recipe) {
            String name = r.getUser().getNickname();
            recipeResponseDtoList.add(RecipeResponseDto.builder()
                    .name(name)
                    .title(r.getTitle())
                    .content(r.getContent())
                    .img(r.getImg())
                    .category(r.getCategory())
                    .createdAt(r.getCreatedAt())
                    .build());
        }

        return recipeResponseDtoList;
    }

    @Override
    public RecipeResponseDto read(Long id) {
        Recipe recipe = recipeRepository.findById(id).orElse(null);
        String name = recipe.getUser().getNickname();
        return RecipeResponseDto.builder()
                .name(name)
                .title(recipe.getTitle())
                .content(recipe.getContent())
                .img(recipe.getImg())
                .category(recipe.getCategory())
                .createdAt(recipe.getCreatedAt())
                .build();
    }

    @Override
    public RecipeResponseDto update(Long userId, RecipePutDto recipePutDto) {
        Recipe recipe = recipeRepository.findById(userId).orElse(null);
        recipe.setTitle(recipePutDto.getTitle());
        recipe.setContent(recipePutDto.getContent());
        recipe.setImg(recipePutDto.getImg());
        recipe.setCategory(recipePutDto.getCategory());
        recipe.setUpdatedAt(LocalDateTime.now());

        Recipe save = recipeRepository.save(recipe);
        String name = recipe.getUser().getNickname();
        return RecipeResponseDto.builder()
                .name(name)
                .title(save.getTitle())
                .content(save.getContent())
                .img(save.getImg())
                .category(save.getCategory())
                .createdAt(save.getCreatedAt())
                .build();
    }

    @Override
    public void delete(Long id) {
        recipeRepository.deleteById(id);
    }
}
