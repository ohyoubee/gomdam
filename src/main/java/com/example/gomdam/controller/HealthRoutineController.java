package com.example.gomdam.controller;

import com.example.gomdam.dto.HealthRoutineDTO;
import com.example.gomdam.entity.HealthRoutine;
import com.example.gomdam.service.HealthRoutineService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HealthRoutineController {

    private final HealthRoutineService healthRoutineService;
    @GetMapping("mainTest")
    public String mainTest(){
    return "/helthRoutine/mainTest";
    }

    //헬스 루틴 List 테스트 페이지
    @GetMapping("helthlisttest")
    public String HealthRoutineTest(Model model){
        healthRoutineService.getAllRoutine();
        {
            List<HealthRoutine> routines = healthRoutineService.getAllRoutine();
            model.addAttribute("routines", routines);
        }
        return "/helthRoutine/helthRoutineTest1";
    }

    //헬스 루틴 저장 테스트 페이지
    @GetMapping("helthjoin")
    public String HealthRoutineJoin(Model model){
        model.addAttribute("healthRoutineDTO", new HealthRoutine());
        return "/helthRoutine/helthDataJoinTest1";
    }
    //헬스 루틴 저장 PostMapping
    @PostMapping("helthjoin")
    public String HealthRoutineJoinTest(@ModelAttribute HealthRoutineDTO healthRoutineDTO){
        healthRoutineService.insertRoutine(healthRoutineDTO);
        return "redirect:/helthlisttest";
    }
}

