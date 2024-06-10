package com.demo.springboot.university.controllers;


import com.demo.springboot.university.dto.StudentCustomDTO;
import com.demo.springboot.university.dto.StudentDTO;
import com.demo.springboot.university.entities.Student;
import com.demo.springboot.university.services.StudentService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService ss){
        this.studentService = ss;
    }

    @GetMapping("/{id}")
    //TODO nonoptional, 404 if not found
    public Optional<StudentDTO> getById(@PathVariable Long id){
       return studentService.getById(id);
    }

    @PostMapping
    //TODO return dto, consume dto instead of entity, use validations.
    public void save(@RequestBody Student student){
        studentService.save(student);
    }

    @DeleteMapping("/{id}")
    //TODO return NO_CONTENT status, 404 if not found
    public void deleteById(@PathVariable Long id){
        studentService.deleteById(id);
    }

    @PutMapping("/update")
    //TODO remove werbs from path, use id in path, consume and return dto,use validations
    public void update(@RequestBody Student student){
        studentService.update(student);
    }

    @PatchMapping("/patch")
    public void patch(@RequestBody Student student){
        studentService.patch(student);
    }

    //TODO implement getAll. return pageable, use dynamic filtering. Hint: use kaczmarzyk lib.
}