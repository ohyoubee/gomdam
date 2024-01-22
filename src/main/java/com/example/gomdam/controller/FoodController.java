package com.example.gomdam.controller;

import com.example.gomdam.dto.FoodDTO;
import com.example.gomdam.entity.FoodNutrient;
import com.example.gomdam.repository.FoodRepository;
import com.example.gomdam.service.FoodService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/food")
public class FoodController {

    private final FoodService foodService;

    @GetMapping("/foodList")
    public void foodList(Model model) {
        List<FoodNutrient> foodNameList = foodService.getAllFood();
        model.addAttribute("foodNameList", foodNameList);
    }

    @GetMapping("/search")
    public void search(Model model, @RequestParam String foodSearchName) {
        List<FoodNutrient> result = foodService.searchFoodList(foodSearchName);
        model.addAttribute("result", result);
    }

    @GetMapping("/foodDetail/{foodId}")
    public String foodDetail(@PathVariable int foodId, Model model) {
        List<FoodNutrient> oneFood = foodService.getOneFood(foodId);
        model.addAttribute("oneFood", oneFood);
        System.out.println(oneFood);
        return "food/foodDetail";
    }
}
