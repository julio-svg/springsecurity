package com.example.eazybeat.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WellcomeController {

    @GetMapping("/wellcome")
    public String sayWelcome(){
        return "Wellcome to Spring Security Application";
    }
}
