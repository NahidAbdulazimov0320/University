package com.demo.springboot.university.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private LocalDateTime establishmentDate;
    private String address;
    private String contactDetails;



    @OneToMany
    private List<School> schools;













}
