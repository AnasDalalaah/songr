package com.songr.songr.controller;

import com.songr.songr.model.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlbumController {
private int length;
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
}

}
