package com.example.minimal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/detail3")
public class Detail3Controller {
    @GetMapping
    public String detail3(){
        return "User/detail3";
    }
}
