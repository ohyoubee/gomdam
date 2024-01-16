package com.example.gomdam.service;

import com.example.gomdam.entity.User;
import com.example.gomdam.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String loginProcess(String userId, String password) {
        User user = userRepository.findByUserId(userId);
        String userPassword = user.getPassword();
        if(password.equals(userPassword)) {
            return "Success";
        } else {
            return "Fail";
        }
    }
}
