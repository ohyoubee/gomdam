package com.example.gomdam.repository;

import com.example.gomdam.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserId(String userId);

}
