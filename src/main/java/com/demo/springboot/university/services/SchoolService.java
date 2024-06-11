package com.demo.springboot.university.services;


import com.demo.springboot.university.dto.SchoolDTO;
import com.demo.springboot.university.mappers.SchoolDTOMapper;
import com.demo.springboot.university.repositories.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SchoolService {
    private final SchoolRepository schoolRepository;
    private final SchoolDTOMapper schoolDTOMapper;

    public SchoolService(SchoolRepository schoolRepository, SchoolDTOMapper schoolDTOMapper) {
        this.schoolRepository = schoolRepository;
        this.schoolDTOMapper = schoolDTOMapper;
    }


    public Optional<SchoolDTO> getByName(String name){
        return schoolRepository.findSchoolByName(name).map(schoolDTOMapper);
    }
}
