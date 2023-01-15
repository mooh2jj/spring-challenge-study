package com.alexgim.cooking.recipe.data.entity;

import com.alexgim.cooking.user.data.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "recipe")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recipeId;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String title;
    private String content;
    private String img;
    private String category;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private int status;
}
