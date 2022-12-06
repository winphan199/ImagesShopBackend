
package com.fullstack2022.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Image extends AbstractPersistable<Long> {
    private String description;
    private String name;
    private String url;
    private String tag;
    
}
