package com.example.songr.controller;

import com.example.songr.models.Album;
import com.example.songr.models.Songs;
import com.example.songr.repository.AlbumRepository;
import com.example.songr.repository.SongsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SongsController {

    @Autowired
    SongsRepository songsRepository;
    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/songs")
    public String GetSongs(Model model){
       model.addAttribute("songs",songsRepository.findAll());
        return "songs";
    }
//specific
@GetMapping("/album/{id}")
public String getparticularAlbum(@PathVariable Integer id, Model model){

    model.addAttribute("particular",albumRepository.findById(id).get());
    return "songAlbum";
}
    @PostMapping("/addOneSong/{id}")
    public RedirectView addOneSong(@RequestParam(value = "title")String title,@RequestParam(value = "length")int length,
                                   @RequestParam(value = "trackNumber")int trackNumber,  @RequestParam(value = "albumSongTiltle")String albumSongTiltle,
                                   @PathVariable Integer id){
        System.out.println(title+trackNumber+albumSongTiltle+length);
        Songs song=new Songs(title,length,trackNumber,albumSongTiltle);
        song.setAlbumsSong(albumRepository.findById(id).get());
        songsRepository.save(song);
        return new RedirectView("/album/{id}");
    }

}
