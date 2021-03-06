package com.example.springsecurityc51.controller;

import com.example.springsecurityc51.entity.User;
import com.example.springsecurityc51.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/reg")
    public String reg(){
        return "reg";
    }

    @PostMapping("/reg")
    public String reg(User user){
        userService.save(user);
        return "reg";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
