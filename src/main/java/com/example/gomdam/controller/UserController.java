package com.example.gomdam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("loginPage")
    public String loginPage() {
        return "/login/loginPage";
    }
}
