package com.demo.springboot.university.mappers;


import com.demo.springboot.university.dto.SchoolDTO;
import com.demo.springboot.university.entities.School;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class SchoolDTOMapper implements Function<School, SchoolDTO> {
    @Override
    public SchoolDTO apply(School school) {
        return new SchoolDTO(school.getName(), school.getDeanName(), school.getFaculty());
    }
}
