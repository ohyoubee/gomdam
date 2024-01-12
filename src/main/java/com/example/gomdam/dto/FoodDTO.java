package com.example.gomdam.dto;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder(toBuilder = true)
@ToString
public class FoodDTO {

    private Integer food_id;

    private String food_name;

    private Integer food_kcal;

    private Integer food_carb;

    private Integer food_protein;

    private Integer food_fat;

    private Integer food_sat_fat;

    private Integer food_unsat_fat;

    private Integer food_chol;

    private Integer food_fiber;

    private Integer food_sodium;

    private Integer food_potassium;

    private Integer food_sugar;

}
