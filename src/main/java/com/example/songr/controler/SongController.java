package com.example.songr.controler;

import com.example.songr.models.Album;
import com.example.songr.models.Songs;
import com.example.songr.repository.AlbumRepository;
import com.example.songr.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SongController {

    @Autowired
    AlbumRepository albumRepository;
    @Autowired
    SongRepository songRepository;

    @GetMapping("/SongsApp")
    public String SongsApp() {
        return ("index.html");
    }

    // Show songs table
    @GetMapping("/SongsList")
    public String SongList(Model model){
        model.addAttribute("SongList",songRepository.findAll());
        return "songlist";
    }

    // show form to add song and select the album
    @GetMapping("/AddSongs")
    public String albums(Model model){
        model.addAttribute("albums",albumRepository.findAll() );
        return "songform";
        }

     // add new song for specific albums
     @PostMapping("/AddSongs")
     public RedirectView saveSong(@RequestParam(value="title") String title,
                                     @RequestParam(value="length") int length,
                                     @RequestParam(value="trackNumber") int trackNumber,
                                     @RequestParam(value="id") int albumID){
            Album album = albumRepository.findById(albumID).get();
            Songs newSong= new Songs(title,length,trackNumber,album);
            album.addSongToAlbum(newSong);
            songRepository.save(newSong);
            return new RedirectView("/SongsList");
        }

        @GetMapping("/albums/{id}")
        public String SongsList(@PathVariable int id , Model model){
            Album album = albumRepository.findById(id).orElseThrow();
            List<Songs> SongList = album.getSongs();
            model.addAttribute("SongList" , SongList);
            return "songlist";
        }

        @PostMapping("/SongsList/{albumId}")
        public RedirectView addSong(@RequestParam String title ,
                                    @RequestParam int length,
                                    @RequestParam int trackNumber ,
                                    @PathVariable int albumId){
            Songs song = new Songs(title , length , trackNumber );
            Album album = albumRepository.findById(albumId).orElseThrow();
            song.setAlbum(album);
            songRepository.save(song);
            return new RedirectView("/albums/{albumId}");
        }





}
