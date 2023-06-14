package com.example.notesapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WebController {

    @GetMapping("new")
    public String form() {
        return "form";
    }

    @GetMapping("")
    public String index() {
        return "index";
    }
}
