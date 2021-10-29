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

    @GetMapping("/AlbumsList")
    public String showAllalbums(Model model){
        model.addAttribute("albumsList", albumRepository.findAll());
        return "albumslist.html";
    }

    @GetMapping("/AddAlbum")
    public String AddAlbums(Model model){
        Album album=new Album();
        model.addAttribute("album", album);
        return "albumForm.html";
    }
    @PostMapping("/AddAlbum")
    public RedirectView addThisAlbum(@ModelAttribute("album") Album album){
        albumRepository.save(album);
        return new RedirectView("/AlbumsList");
    }

}
