package com.demo.springboot.university.services;
import com.demo.springboot.university.dto.StudentBasicDTO;
import com.demo.springboot.university.dto.StudentCustomDTO;
import com.demo.springboot.university.dto.StudentDTO;
import com.demo.springboot.university.entities.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    Optional<StudentDTO> getById(Long id);

    void save(Student student);

    void deleteById(Long id);
    void update(Student student);
    void patch(Student student);

    List<Student> findByAgeRange(int minAge, int maxAge);



}
