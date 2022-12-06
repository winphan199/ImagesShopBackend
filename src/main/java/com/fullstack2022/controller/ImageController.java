
package com.fullstack2022.controller;

import com.fullstack2022.entity.Image;
import com.fullstack2022.service.ImageService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class ImageController {
    @Autowired
    private ImageService imageService;
    
    @GetMapping("/images")
    public List<Image> getImages() {
        return this.imageService.getImages();
    }
    
    @PostMapping("/images")
    public Image addImage(@RequestBody Image newImage) {
        
        return imageService.addImage(newImage);
    }
}