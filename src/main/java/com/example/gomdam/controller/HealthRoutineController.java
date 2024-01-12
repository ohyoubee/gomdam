package com.example.gomdam.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HealthRoutineController {

    //헬스 루틴 List 테스트 페이지
    @GetMapping("helthlisttest")
    public String HealthRoutineTest(){
        return "/helthRoutine/helthRoutineTest1";
    }
    //헬스 루틴 저장 테스트 페이지
    @GetMapping("helthjoin")
    public String HealthRoutineJoin(){
        return "/helthRoutine/helthDataJoinTest1";
    }
}

