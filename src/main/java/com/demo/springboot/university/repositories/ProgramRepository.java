package com.demo.springboot.university.repositories;

import com.demo.springboot.university.entities.Course;
import com.demo.springboot.university.entities.Program;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProgramRepository extends CrudRepository<Program, Long> {

    @Query("SELECT c FROM Course c WHERE c.program.name = :programName")
    List<Course> getAllCourses(@Param("programName") String programName);
}
