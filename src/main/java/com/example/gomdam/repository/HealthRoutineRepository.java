package com.example.gomdam.repository;


import com.example.gomdam.entity.HealthRoutine;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HealthRoutineRepository extends JpaRepository<HealthRoutine,Integer> {
}
