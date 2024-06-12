package com.demo.springboot.university.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.springboot.university.entities.University;

public interface UniversityRepository extends JpaRepository<University, Long> {

    University findByName(String name);


}
