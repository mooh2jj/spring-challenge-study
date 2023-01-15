package com.alexgim.cooking.food.data.repository;

import com.alexgim.cooking.food.data.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
