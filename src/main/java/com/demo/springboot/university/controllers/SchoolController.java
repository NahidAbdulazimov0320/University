package com.demo.springboot.university.controllers;


import com.demo.springboot.university.dto.SchoolDTO;
import com.demo.springboot.university.services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/school")
public class SchoolController {


    private final SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }


    @GetMapping("/{name}")
    public Optional<SchoolDTO> getByName(@PathVariable String name){
        return schoolService.getByName(name);
    }
}
