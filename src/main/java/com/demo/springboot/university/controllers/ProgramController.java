package com.demo.springboot.university.controllers;

import com.demo.springboot.university.entities.Course;
import com.demo.springboot.university.entities.Program;
import com.demo.springboot.university.services.ProgramService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/program")
public class ProgramController {

    private final ProgramService programService;

    public ProgramController(ProgramService service){
        this.programService = service;
    }


    @GetMapping("/{programName}")
    public List<Course> getAllCourses(@PathVariable String programName){
        return programService.getAllCourses(programName);
    }

    @PostMapping
    public void save(Program program){
        programService.save(program);
    }


}
