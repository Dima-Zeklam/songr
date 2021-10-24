package com.example.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@Controller
public class HomeController {
    @GetMapping("/hello")
    @ResponseBody
    public String helloworld() {
        return "hello world";
    }

    @GetMapping("/")
    public String home() {
        return ("home.html");
    }

    @GetMapping("/capitalize/{name}")
    @ResponseBody
    public String welcomeMessage(@PathVariable String name) {
        return name.toUpperCase(Locale.ROOT);
    }

//

Album albums []= {  new Album("Avril Lavigne", "Head Above Water", 3, 300,
        "https://akns-images.eonline.com/eol_images/Entire_Site/2018818/rs_600x600-180918113415-600.avril-lavigne.91818.jpg?fit=around%7C1080:1080&output-quality=90&crop=1080:1080;center,top"),      new Album("Jubilee", "Japanese Breakfast", 3, 300,
        "https://upload.wikimedia.org/wikipedia/en/8/84/Album_Cover_-_Jubilee_%28Japanese_Breakfast_album%29.jpeg"),  new Album("Happier Than Ever", " Billie Eilish", 3, 300, "https://upload.wikimedia.org/wikipedia/zh/thumb/4/45/Billie_Eilish_-_Happier_Than_Ever.png/220px-Billie_Eilish_-_Happier_Than_Ever.png")};

    @GetMapping("/albums")
    public String albums(Model model) {
        model.addAttribute("albums",albums);
        return "albums.html";
    }
}