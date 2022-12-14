
package com.fullstack2022.repo;

import com.fullstack2022.entity.Image;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepo extends JpaRepository<Image, Long> {
    List<Image> findByTag(Optional<String> tag);
}
