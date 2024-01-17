package com.example.gomdam.service;

import com.example.gomdam.dto.UserDTO;
import com.example.gomdam.entity.User;
import com.example.gomdam.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;


    public String loginProcess(String userId, String password) {
        User user = userRepository.findByUserId(userId);
        String userPassword = user.getPassword();
        if(password.equals(userPassword)) {
            return "Success";
        } else {
            return "Fail";
        }
    }
    public UserDTO insertUser(UserDTO userDTO) {
        User user = new User();

        user.setSeq(userDTO.getSeq());
        user.setUserId(userDTO.getUserId());
        user.setPassword(userDTO.getPassword());

        // DB에 저장
        userRepository.save(user);

        // Member를 MemberDTO로 변환하여 반환
        return userDTO;
    }
}
