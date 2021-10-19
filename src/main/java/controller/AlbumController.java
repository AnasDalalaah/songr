package com.songr.songr.controller;

//import com.songr.songr.model.Album;
import com.songr.songr.model.Albums;
import com.songr.songr.repository.AlbumsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlbumController {
//private int length;
//private String imageUrl;
//@GetMapping("/album")
//public String getAlbum(Model model){
//    Album album1 = new Album("Sahran","Amr Diab",12,2900,"https://i1.sndcdn.com/artworks-LZartXtIp9YJgxfm-bwIdOg-t500x500.jpg");
//    Album album2 = new Album("Maolod sant 80","Hamza Namira",12,2700,"http://www.arabsong2.com/wp-content/uploads/2019/05/1558405962.jpg");
//    Album album3 = new Album("Kol Yom Mn Da","Mohammad humaki",10,2500,"http://arabsong.net/images/albums/Kol%20Youm%20Men%20Dah.jpg");
//    List<Album> albums=new ArrayList<>();
//    albums.add(album1);
//    albums.add(album2);
//    albums.add(album3);
//    model.addAttribute("albums" , albums);
//    return "albums";
//}

    @Autowired
    AlbumsRepository albumsRepository ;
    @GetMapping("/albums")
    public String albumController (Model model) {
        model.addAttribute("albums", albumsRepository.findAll());
        return "Albums.html";
    }

//    @PostMapping("/addAlbum")
//    public RedirectView  addFormData (@RequestParam("title") String title ,@RequestParam ("artist") String artist,
//                                      @RequestParam("songCount") int songCount,
//                                      @RequestParam("length")int length ,@RequestParam("imageUrl") String imageUrl){
//        Album album = new Album(title , artist , songCount ,length , imageUrl);
//        albumsRepository.save(album);
//        return new RedirectView("/albums");
//    }
@PostMapping("/addAlbum")
public RedirectView  addFormData (@ModelAttribute Albums album , Model model){
    model.addAttribute("album" , album);
    albumsRepository.save(album);
    return new RedirectView("/albums");
}

}