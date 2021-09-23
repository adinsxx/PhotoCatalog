package com.example.ERDLab.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name="Photo")
public class Photo {
    @Id
    @Column(name="photo_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int photo_id;

    @ManyToOne
    @Column(name="collector_id")
    private Collector id;

    @Column(name="photo_filename")
    private String photoFilename;

    @Column(name="photo_datestamp")
    private LocalDateTime dateStamp;

    @Column(name="photo_visible")
    private String photoFileName;

    @OneToOne
    @Column(name="photo_recipe_id")
    private Recipe recipeId;

}
