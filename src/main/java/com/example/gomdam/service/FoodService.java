package com.example.gomdam.service;

import com.example.gomdam.entity.FoodNutrient;
import com.example.gomdam.repository.FoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class FoodService {

    private final FoodRepository foodRepository;

    public List<FoodNutrient> getAllFood() {
        return foodRepository.findAll();
    }

    public List<FoodNutrient> searchFoodList(String foodSearchName) {
        List<FoodNutrient> result = foodRepository.findByFoodNameContaining(foodSearchName);
        return result;
    }

    public List<FoodNutrient> getOneFood(int foodId) {
        return foodRepository.findByFoodId(foodId);
    }
}
