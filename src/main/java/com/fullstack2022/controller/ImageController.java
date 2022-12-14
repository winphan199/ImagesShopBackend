
package com.fullstack2022.controller;

import com.fullstack2022.entity.Image;
import com.fullstack2022.service.ImageService;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/images")
public class ImageController {
    @Autowired
    private ImageService imageService;

    @GetMapping("")
    public List<Image> getImagesByTag(@RequestParam(value="tag") Optional<List<String>> list) {
        System.out.println(list.isPresent());
        System.out.println(list);
        return list.isPresent()?(this.imageService.getImagesByTagList(list.get())):this.imageService.getImages();
    }
    
    @PostMapping("")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public Image addImage(@RequestBody Image newImage) {
        
        return imageService.addImage(newImage);
    }

}
