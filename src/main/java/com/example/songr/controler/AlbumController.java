package com.example.songr.controler;

import com.example.songr.models.Album;
import com.example.songr.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AlbumController {
    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/hello")
    @ResponseBody
    public String helloH() {
        return ("hello world");
    }
    @GetMapping("/")
    public String homePage() {
        return ("home.html");
    }

    @GetMapping("/capitalize/{word}")
    public String renderCapitalizePage(Model model, @PathVariable String word) {
        model.addAttribute("name", word.toUpperCase());
        return "hello.html";
    }

    @GetMapping("/showAllalbums")
    public String showAllalbums(Model model){
        model.addAttribute("albums", albumRepository.findAll());
        return "albums.html";
    }

    @PostMapping("/addAllalbums")

    public RedirectView addAllalbums(@RequestParam(value = "title")String title, @RequestParam(value = "artist")String artist, @RequestParam(value = "songCount")int songCount, @RequestParam(value = "length")int length, @RequestParam(value = "imageUrl")String imageUrl){
        Album album=new Album(title,artist,songCount,length,imageUrl);
        albumRepository.save(album);
        return new RedirectView("/showAllalbums");
    }

}
