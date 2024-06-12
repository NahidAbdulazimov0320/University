package com.demo.springboot.university.services;


import com.demo.springboot.university.entities.University;
import com.demo.springboot.university.repositories.UniversityRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.Set;


// READY
@Service
public class UniversityService {

   private final UniversityRepository universityRepository;



    public UniversityService(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }


    public void saveUniversity(University university) {
        Optional<University> existingUniversity = Optional.ofNullable(universityRepository.findByName(university.getName()));
        if (existingUniversity.isPresent()) {
            return;
        }
        universityRepository.save(university);
        }

    University findByName(String name){
    if(universityRepository.findByName(name) == null) throw new RuntimeException();
    else return universityRepository.findByName(name);
    }



    }



