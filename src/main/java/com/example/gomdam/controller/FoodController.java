package com.example.gomdam.controller;

import com.example.gomdam.dto.FoodDTO;
import com.example.gomdam.entity.FoodNutrient;
import com.example.gomdam.repository.FoodRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@Log4j2
@RequestMapping("/food")
public class FoodController {

    @Autowired
    FoodRepository foodRepository;

    @GetMapping("/ex1")
    public void ex1(Model model) {
        log.info("ex1.............");
        List<FoodNutrient> foodList = foodRepository.findAll();
        model.addAttribute("foodList", foodList);
    }

    @GetMapping("/foodList")
    public void foodList(Model model) {
        List<FoodNutrient> foodNameList = foodRepository.findAll();
        model.addAttribute("foodNameList", foodNameList);
    }

    @GetMapping("/search")
    public void search(Model model, @RequestParam(name = "search", required = false) String search) {
    }
}
