package com.demo.springboot.university.dto;


public class StudentCustomDTO extends StudentDTO{

    private int age;
    public StudentCustomDTO(String name, String surname,int age) {
        super(name, surname);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
