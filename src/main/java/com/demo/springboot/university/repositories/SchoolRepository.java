package com.demo.springboot.university.repositories;


import com.demo.springboot.university.dto.SchoolDTO;
import com.demo.springboot.university.entities.School;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SchoolRepository extends CrudRepository<School, Long> {

    @Query("SELECT s FROM School s WHERE s.name = :name")
    public Optional<School> findSchoolByName(@Param("name") String name);
}
