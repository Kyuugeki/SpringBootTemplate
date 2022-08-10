package com.springapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Index {
     
    @GetMapping("")
    public String viewHomePage() {
        return "index";
    }
}