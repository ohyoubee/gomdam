package com.example.gomdam.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Table(name= "HealthRoutine")
@ToString
@Getter
@Setter
public class HealthRoutine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //운동 종목
    @Column(nullable = false)
    private String exerciseType;

    //무게
    @Column(nullable = false)
    private Integer weight;

    //세트수
    @Column(nullable = false)
    private Integer sets;

    //저장날짜
    @Column //notnull은 조금 보고 추가할 예정.
    private LocalDate recordDate;
}