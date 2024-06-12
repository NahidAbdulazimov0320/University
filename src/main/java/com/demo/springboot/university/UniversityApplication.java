package com.demo.springboot.university;

import com.demo.springboot.university.entities.Course;
import com.demo.springboot.university.entities.Student;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.time.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

@SpringBootApplication
public class UniversityApplication {
    public static void main(String[] args) {
       SpringApplication.run(UniversityApplication.class, args);


    }

}
