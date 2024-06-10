package com.demo.springboot.university.entities;

import jakarta.persistence.*;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Faculty {  // Professors

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String surname;
    private String position;

    @ManyToMany
    private List<Program> program;






}
