package com.alexgim.cooking.food.service;

import com.alexgim.cooking.food.data.dto.FoodPostDto;
import com.alexgim.cooking.food.data.dto.FoodResponseDto;

import java.util.List;

public interface FoodService {
    FoodResponseDto save(FoodPostDto foodPostDto);
    FoodResponseDto read(Long id);
    List<FoodResponseDto> readAll();


}
