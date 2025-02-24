package com.example.hellogithubactions.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("")
    public String message(Model model) {
        String message = "welcome";

        model.addAttribute("welcome", message);
        return "welcome";
    }
}
