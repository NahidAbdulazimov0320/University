package com.demo.springboot.university.dto;

public class StudentDTO {

    private  String name;
    private String surname;

    public StudentDTO(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
