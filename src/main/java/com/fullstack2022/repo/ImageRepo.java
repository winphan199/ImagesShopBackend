
package com.fullstack2022.repo;

import com.fullstack2022.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepo extends JpaRepository<Image, Long> {
    
}
