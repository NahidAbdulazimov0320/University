package com.demo.springboot.university.repositories;

import com.demo.springboot.university.dto.StudentDTO;
import com.demo.springboot.university.entities.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface StudentRepository extends CrudRepository<Student,Long> {

}
