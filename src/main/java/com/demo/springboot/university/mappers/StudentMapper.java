package com.demo.springboot.university.mappers;

import com.demo.springboot.university.dto.StudentDTO;
import com.demo.springboot.university.entities.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    StudentMapper studentMapper = Mappers.getMapper(StudentMapper.class);

    @Mapping(target = "name", source = "name")
    @Mapping(target = "surname", source = "surname")
    @Mapping(target = "age", source = "age")
    StudentDTO studentToStudentDTO(Student student);

}
