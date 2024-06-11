package com.demo.springboot.university.dto;

import com.demo.springboot.university.entities.Faculty;

import java.util.List;

public record SchoolDTO(String name, String deanName, List<Faculty> faculty) {
}
