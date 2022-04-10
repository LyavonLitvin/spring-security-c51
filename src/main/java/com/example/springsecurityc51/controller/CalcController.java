package com.example.springsecurityc51.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class CalcController {

    @GetMapping
    public String calc(){
        return "calc";
    }

    @PostMapping
    public String calc(double a, double b, String op, Model model){
        double result = a + b;
        model.addAttribute("result",result);
        return  "calc";
    }
}
