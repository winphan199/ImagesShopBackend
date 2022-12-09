
package com.fullstack2022.service;

import com.fullstack2022.entity.Image;
import com.fullstack2022.repo.ImageRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageService {
    @Autowired
    private ImageRepo imageRepo;
    
    public List<Image> getImages() {
        return this.imageRepo.findAll();
    }
    
    public Image addImage(Image newImage) {
        return imageRepo.save(newImage);
    }
}
