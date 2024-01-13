package com.example.gomdam.service;

import com.example.gomdam.dto.HealthRoutineDTO;
import com.example.gomdam.entity.HealthRoutine;
import com.example.gomdam.repository.HealthRoutineRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class HealthRoutineService {
    private final HealthRoutineRepository healthRoutineRepository;
    public List<HealthRoutine> getAllRoutine() {
        return healthRoutineRepository.findAll();
    }

    public HealthRoutineDTO insertRoutine(HealthRoutineDTO healthRoutineDTO) {
        HealthRoutine healthRoutine= new HealthRoutine();

        healthRoutine.setId(healthRoutineDTO.getId());
        healthRoutine.setExerciseType(healthRoutineDTO.getExerciseType());
        healthRoutine.setWeight(healthRoutineDTO.getWeight());
        healthRoutine.setSets(healthRoutineDTO.getSets());
        //Weight X Sets = 를 계산하는 코드
        int weight = healthRoutineDTO.getWeight();
        int sets = healthRoutineDTO.getSets();
        int calculatedValue = weight * sets;
        healthRoutine.setWeightXsets(calculatedValue); // "WeightSetsProduct"는 예시로 사용한 컬럼명

        healthRoutine.setRecordDate(healthRoutineDTO.getRecordDate());


        // 현재 날짜와 시간을 얻기
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String formattedDateTime = now.format(formatter);
        // String으로 변환한 값을 LocalDateTime으로 변경
        LocalDateTime parsedDateTime = LocalDateTime.parse(formattedDateTime, formatter);
        // member의 joinDate에 설정
        healthRoutine.setRecordDate(LocalDate.from(parsedDateTime));

        // DB에 저장
        healthRoutineRepository.save(healthRoutine);

        // Member를 MemberDTO로 변환하여 반환
        return healthRoutineDTO;

    }

}
