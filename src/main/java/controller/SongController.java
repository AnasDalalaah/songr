package com.songr.songr.controller;



import com.songr.songr.model.Song;
import com.songr.songr.repository.AlbumsRepository;
import com.songr.songr.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongController {

    @Autowired
    SongRepository songRepository ;
    @Autowired
    AlbumsRepository albumsRepository ;


    @GetMapping("/songs")
    public  String songs (Model model){
        model.addAttribute("song" , songRepository.findAll());
        return "songs.html";
    }

    @GetMapping("/albums/{id}")
    public String getSongs(@PathVariable ("id") int id , Model model){
        model.addAttribute("albums",albumsRepository.findById(id).get());
        return("oneAlbum.html");
    }

    @PostMapping("/addSong/{id}")
    public RedirectView addSong(@ModelAttribute Song song , @PathVariable("id") int id){
        song.setAlbums(albumsRepository.findById(id).get());
        songRepository.save(song);
        return new RedirectView("/albums/{id}");
    }

}