package com.alexgim.cooking.recipe.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecipePutDto {
    private String title;
    private String content;
    private String img;
    private String category;

}
