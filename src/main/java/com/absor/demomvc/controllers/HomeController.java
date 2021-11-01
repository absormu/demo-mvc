package com.absor.demomvc.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {

    @GetMapping
    public String welcome(Model model){
        String messages = "Welcome to Spring MVC";
        model.addAttribute("msg",messages);
        return "index";
    }
}
