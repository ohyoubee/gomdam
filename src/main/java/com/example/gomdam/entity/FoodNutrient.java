package com.example.gomdam.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name= "food_nutrient")
@ToString
@Getter
@Setter
public class FoodNutrient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer food_id;

    @Column(length = 100, nullable = false)
    private String food_name;

    @Column(nullable = true)
    private Integer food_kcal;

    @Column(nullable = true)
    private Integer food_carb; // carbohydrate

    @Column(nullable = true)
    private Integer food_protein;

    @Column(nullable = true)
    private Integer food_fat; // jibang

    @Column(nullable = true)
    private Integer food_sat_fat; // pohwajibang

    @Column(nullable = true)
    private Integer food_unsat_fat; // bullbohwajibang

    @Column(nullable = true)
    private Integer food_chol; // cholesterol

    @Column(nullable = true)
    private Integer food_fiber; // sikEseomyou

    @Column(nullable = true)
    private Integer food_sodium; // natrium

    @Column(nullable = true)
    private Integer food_potassium; // kallium

    @Column(nullable = true)
    private Integer food_sugar;

}
