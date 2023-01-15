package com.alexgim.cooking.food.data.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class FoodPostDto {
    private String name;
    private String category;
    private String info;
    private String img;
}
