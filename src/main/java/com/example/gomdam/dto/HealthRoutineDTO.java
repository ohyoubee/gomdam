package com.example.gomdam.dto;


import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Data
public class HealthRoutineDTO {
    private Integer id;
    private String exerciseType;
    private Integer weight;
    private Integer sets;
    private LocalDate recordDate;
}
