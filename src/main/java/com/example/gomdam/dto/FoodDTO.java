package com.example.gomdam.dto;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder(toBuilder = true)
@ToString
public class FoodDTO {

    private Integer food_Id;

    private String food_Name;

    private Integer food_Kcal;

    private Integer food_Carb;

    private Integer food_Protein;

    private Integer food_Fat;

    private Integer food_Sat_Fat;

    private Integer food_Unsat_Fat;

    private Integer food_Chol;

    private Integer food_Fiber;

    private Integer food_Sodium;

    private Integer food_Potassium;

    private Integer food_Sugar;

}
