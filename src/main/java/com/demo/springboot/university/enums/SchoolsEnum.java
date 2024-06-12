package com.demo.springboot.university.enums;

import com.university.university.entity.Program;
import lombok.Getter;

import java.util.Set;

@Getter
public enum SchoolsEnum {
    BAPA("Public and International Affairs"), BUSINESS("Business"), SITE ("School of IT and Engineering"), EDUCATION("School of Education"), LAW("School of Law");

    private final String fullName;
    SchoolsEnum(String fullName){
        this.fullName = fullName;
    }

}
