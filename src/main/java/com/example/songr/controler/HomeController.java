package com.example.songr.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {


    @GetMapping("/")
    public String homePage() {
        return ("home.html");
    }



    @GetMapping("/capitalize/{word}")
    public String renderCapitalizePage(Model model, @PathVariable String word) {
        model.addAttribute("name", word.toUpperCase());
        return "home.html";
    }
}
