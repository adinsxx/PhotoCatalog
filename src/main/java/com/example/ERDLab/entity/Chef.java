package com.example.ERDLab.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@Table(name="Chef")
public class Chef {
    @Id
    @Column(name="chef_id")
    private int chef_id;
    @Column(name="chef_firstname")
    private String chefFirstName;
    @Column(name="chef_lastname")
    private String chefLastName;
    @Column(name="chef_avatar")
    private String avatarFileName;
}
