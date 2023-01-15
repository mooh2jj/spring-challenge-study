package com.alexgim.cooking.recipe.data.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecipeResponseDto {
    private String name;
    private String title;
    private String content;
    private String img;
    private String category;
    private LocalDateTime createdAt;
}
