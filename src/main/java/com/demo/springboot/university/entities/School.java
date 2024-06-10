package com.demo.springboot.university.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class School {  //SITE, BAPA
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany
    List<Faculty> faculty;





}
