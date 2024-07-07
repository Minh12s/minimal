package com.example.minimal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/detail1")
public class Detail1Controller {
    @GetMapping
    public String detail1(){
        return "User/detail1";
    }
}
