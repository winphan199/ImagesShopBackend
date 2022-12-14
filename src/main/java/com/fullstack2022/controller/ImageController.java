
package com.fullstack2022.controller;

import com.fullstack2022.entity.Image;
import com.fullstack2022.service.ImageService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;


@RestController
@RequestMapping("/api")
public class ImageController {
    @Autowired
    private ImageService imageService;
    
    // @GetMapping("/images")
    // public List<Image> getImages() {
    //     return this.imageService.getImages();
    // }

    @GetMapping("/images")
    public List<Image> getImagesByTag(@RequestParam String tag) {
        return this.imageService.getImagesByTag(tag);
    }
    
    @CrossOrigin(origins = "*")
    @PostMapping("/images")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public Image addImage(@RequestBody Image newImage) {
        
        return imageService.addImage(newImage);
    }

}
