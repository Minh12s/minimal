package com.example.minimal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/detail2")
public class Detail2Controller {
    @GetMapping
    public String detail2(){
        return "User/detail2";
    }
}
