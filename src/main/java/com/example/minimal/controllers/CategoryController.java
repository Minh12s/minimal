package com.example.minimal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/category")
public class CategoryController {
    @GetMapping
    public String category(){
        return "/admin/Category/category";
    }
    @GetMapping("/addCategory")
    public String addCategory(){
        return "/admin/Category/addCategory";
    }
    @GetMapping("/editCategory")
    public String editCatgory(){
        return "/admin/Category/editCategory";
    }
}

