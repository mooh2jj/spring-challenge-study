package com.alexgim.cooking.recipe.data.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@Builder
public class RecipePostDto {
    @Min(value = 1)
    private Long userId;
    @NotBlank
    private String title;
    private String content;
    private String img;
    @NotBlank
    private String category;
}
