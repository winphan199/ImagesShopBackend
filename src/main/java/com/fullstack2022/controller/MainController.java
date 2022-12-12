package com.fullstack2022.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    
    @RequestMapping("*")
    @ResponseBody
    public String pageNotFound() {
        return "ERROR 404: PAGE NOT FOUND";
    }
    // @GetMapping("*")
    // public String redirectToIndex() {
    //     return "redirect:/";
    // }

    @GetMapping("/")
    @ResponseBody
    public String homePage() {
        return "Welcome to image api used for FullStack Web Developement course 2022!";
    }
}
