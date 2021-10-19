package com.songr.songr.controller;

import com.songr.songr.model.Album;
import com.songr.songr.repository.AlbumsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

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
/*private int length;
private String imageUrl;
@GetMapping("/album")
public String getAlbum(Model model){
    Album album1 = new Album("HIT25","ADELE",12,2900,"https://www.tunefab.com/images/adele-25-cd.jpg");
    Album album2 = new Album("ASEL EL ESHSS","Amal Maher",12,2700,"https://www.arageek.com/wp-content/uploads/2019/01/%D8%A3%D9%84%D8%A8%D9%88%D9%85-%D8%A3%D8%B5%D9%84-%D8%A7%D9%84%D8%A5%D8%AD%D8%B3%D8%A7%D8%B3-%D8%A8%D8%AF%D8%A7%D9%8A%D8%A9-%D9%85%D8%B1%D8%AD%D9%84%D8%A9-%D9%82%D9%88%D9%8A%D8%A9-%D9%81%D9%8A-%D9%85%D8%B3%D9%8A%D8%B1%D8%A9-%D8%A2%D9%85%D8%A7%D9%84-%D9%85%D8%A7%D9%87%D8%B1-%D8%AF%D9%88%D9%86-%D8%B4%D9%83.png");

    Album album3 = new Album("This is Acting","SIA",10,2500,("https://upload.wikimedia.org/wikipedia/en/f/fd/Thisisacting_albumcover.png");
    List<Album> albums=new ArrayList<>();
    albums.add(album1);
    albums.add(album2);
    albums.add(album3);
    model.addAttribute("Albums" , albums);
    return "albums.html";
}*/
 @Autowired
    AlbumsRepository albumsRepository ;
    @GetMapping("/albums")
    public String albumController (Model model) {
        model.addAttribute("albums", albumsRepository.findAll());
        return "albums.html";
    }

    @PostMapping("/addAlbum")
    public RedirectView  addFormData (@RequestParam("title") String title ,@RequestParam ("artist") String artist,
                                      @RequestParam("songCount") int songCount,
                                      @RequestParam("length")int length ,@RequestParam("imageUrl") String imageUrl){
      Album album = new Album(title , artist , songCount ,length , imageUrl);
        albumsRepository.save(album);
        return new RedirectView("/albums");
    }
}
