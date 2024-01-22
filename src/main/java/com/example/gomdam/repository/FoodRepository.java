package com.example.gomdam.repository;

import com.example.gomdam.entity.FoodNutrient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodRepository extends JpaRepository<FoodNutrient, Integer> {

    List<FoodNutrient> findByFoodNameContaining(String foodSearchName);

    List<FoodNutrient> findByFoodId(int foodId);

}
