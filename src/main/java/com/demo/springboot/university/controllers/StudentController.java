package com.demo.springboot.university.controllers;


import com.demo.springboot.university.dto.StudentDTO;
import com.demo.springboot.university.entities.Student;
import com.demo.springboot.university.services.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDTO> getById(@PathVariable Long id){
       if(studentService.getById(id) == null)
           return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
       else
           return new ResponseEntity<>(studentService.getById(id), HttpStatus.OK);
    }


    @PostMapping
    //TODO use validations.
    public ResponseEntity save(@RequestBody Student studentDTO){
        studentService.save(studentDTO);
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }

    // Used DTO for saving
//    @PostMapping
//    public void save(@RequestBody StudentDTO studentDTO){
//        studentService.save(studentDTO);
//    }

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