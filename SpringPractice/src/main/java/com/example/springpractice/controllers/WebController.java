package com.example.springpractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//vrací html view a může používat thymeleaf a může mít stav
@Controller
public class WebController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
