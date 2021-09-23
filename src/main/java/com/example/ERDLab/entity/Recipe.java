package com.example.ERDLab.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name="Recipe")
public class Recipe {
    @Id
    @Column(name="recipe_id")
    private int recipeId;

    @ManyToOne
    @Column(name="recipe_chef_id")
    private Chef chef_id;

    @Column(name="recipe_title")
    private String recipeTitle;

    @Column(name="recipe_description")
    private String recipeDescription;
}
