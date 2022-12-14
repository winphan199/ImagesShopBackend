
package com.fullstack2022.service;

import com.fullstack2022.entity.Image;
import com.fullstack2022.repo.ImageRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageService {
    @Autowired
    private ImageRepo imageRepo;
    
    public List<Image> getImages() {
        return this.imageRepo.findAll();
    }

    public List<Image> getImagesByTag(String tag) {
        return this.imageRepo.findByTag(tag);
    }

    public List<Image> getImagesByTagList(List<String> list) {
        List<Image> imageList = new ArrayList<Image>();
        list.forEach(tag -> imageList.addAll(this.imageRepo.findByTag(tag)));
        return imageList;
    }
    
    public Image addImage(Image newImage) {
        return imageRepo.save(newImage);
    }
}
