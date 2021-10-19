package com.songr.songr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class WelcomingVisitors {

    @GetMapping("/")
    public String welcoming(Model model) {
        model.addAttribute("welcome","WELCOME TO MY OWN SONGR APP" );
        return "WelcomingVisitors.html";
    }
}
