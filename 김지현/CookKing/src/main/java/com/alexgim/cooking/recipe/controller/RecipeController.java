package com.alexgim.cooking.recipe.controller;

import com.alexgim.cooking.component.ValidationResult;
import com.alexgim.cooking.recipe.data.dto.RecipePostDto;
import com.alexgim.cooking.recipe.data.dto.RecipePutDto;
import com.alexgim.cooking.recipe.data.dto.RecipeResponseDto;
import com.alexgim.cooking.recipe.service.RecipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/recipe")
@RequiredArgsConstructor
public class RecipeController {

    private final RecipeService recipeService;
    private final ValidationResult validationResult;

    @GetMapping()
    public ResponseEntity readAllRecipe() {
        List<RecipeResponseDto> recipeResponseDtoList = recipeService.readAll();
        return ResponseEntity.status(HttpStatus.OK).body(recipeResponseDtoList);
    }

    @GetMapping("/{id}")
    public ResponseEntity readRecipe(@PathVariable Long id) {
        if(id < 1) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("잘못된 인덱스입니다.");
        }
        RecipeResponseDto recipe = recipeService.read(id);
        return ResponseEntity.status(HttpStatus.OK).body(recipe);
    }

    @PostMapping()
    public ResponseEntity createRecipe(@Valid @RequestBody RecipePostDto recipePostDto, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            StringBuilder sb = new StringBuilder();
            bindingResult.getAllErrors().forEach(objectError -> {
                FieldError error = (FieldError) objectError;
                String field = error.getField();
                String defaultMessage = error.getDefaultMessage();

                sb.append("Field : " + field).append(", message : " + defaultMessage).append("\n");
            });
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(sb.toString());
        }

        RecipeResponseDto save = recipeService.save(recipePostDto);
        return ResponseEntity.status(HttpStatus.OK).body(save);
    }

    @PutMapping("/{userId}")
    public ResponseEntity updateRecipe(@PathVariable Long userId, @Valid @RequestBody RecipePutDto recipePutDto, BindingResult bindingResult) {
        if(userId < 1) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("잘못된 인덱스입니다.");
        }
        boolean result = validationResult.result(bindingResult);
        if(!result){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(validationResult.getSb().toString());
        }

        RecipeResponseDto update = recipeService.update(userId, recipePutDto);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(update);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteRecipe(@PathVariable Long id) {
        recipeService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body("정상적으로 레시피가 삭제되었습니다");
    }
}
