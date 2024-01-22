package com.example.gomdam.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name= "food_Nutrient")
@ToString
@Getter
@Setter
public class FoodNutrient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer foodId;

    @Column(length = 100, nullable = false)
    private String foodName;

    @Column(nullable = true, name="foodKcal")
    private Integer foodKcal;

    @Column(nullable = true, name="foodCarb")
    private Integer foodCarb; // carbohydrate

    @Column(nullable = true, name="foodProtein")
    private Integer foodProtein;

    @Column(nullable = true, name="foodFat")
    private Integer foodFat; // jibang

    @Column(nullable = true, name="foodSatFat")
    private Integer foodSatFat; // pohwajibang

    @Column(nullable = true, name="foodUnsatFat")
    private Integer foodUnsatFat; // bullbohwajibang

    @Column(nullable = true, name="foodChol")
    private Integer foodChol; // cholesterol

    @Column(nullable = true, name="foodFiber")
    private Integer foodFiber; // sikEseomyou

    @Column(nullable = true, name="FoodSodium")
    private Integer foodSodium; // natrium

    @Column(nullable = true, name="foodPotassium")
    private Integer foodPotassium; // kallium

    @Column(nullable = true, name="foodSugar")
    private Integer foodSugar;

}
