package com.example.gomdam.controller;

import com.example.gomdam.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    public final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/loginPage")
    public String loginPage() {
        return "/login/loginPage";
    }

    @PostMapping("/loginPage")
    public String loginProcess(@RequestParam String userId, @RequestParam String password) {
        String result = userService.loginProcess(userId, password);
        if(result.equals("Success")) {
            return "redirect:/home";
        } else {
            return "index";
        }
    }

    @GetMapping("/home")
    public String home() {
        return "/login/home";
    }
}
