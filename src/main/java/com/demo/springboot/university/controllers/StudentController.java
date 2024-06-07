package com.demo.springboot.university.controllers;


import com.demo.springboot.university.dto.StudentDTO;
import com.demo.springboot.university.entities.Student;
import com.demo.springboot.university.services.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService ss;

    public StudentController(StudentService ss){
        this.ss =ss;
    }

    @GetMapping("/get/{id}")
    public Optional<StudentDTO> getById(@PathVariable Long id){
       return ss.getById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        ss.save(student);
    }

    @DeleteMapping("delete/{id}")
    public void deleteById(@PathVariable Long id){
        ss.deleteById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        ss.update(student);
    }

    @PatchMapping("/patch")
    public void patch(@RequestBody Student student){
        ss.patch(student);
    }


}
