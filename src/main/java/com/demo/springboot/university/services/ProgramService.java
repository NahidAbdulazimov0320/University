package com.demo.springboot.university.services;

import com.demo.springboot.university.entities.Course;
import com.demo.springboot.university.entities.Program;
import com.demo.springboot.university.repositories.ProgramRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramService {

    private final ProgramRepository programRepository;

    public ProgramService(ProgramRepository programRepository){
        this.programRepository = programRepository;
    }


    public List<Course> getAllCourses(String programName){
        return programRepository.getAllCourses(programName);
    }


    public void save(Program program) {
        programRepository.save(program);
    }
}
