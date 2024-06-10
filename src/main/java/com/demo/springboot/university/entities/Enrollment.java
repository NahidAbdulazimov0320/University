package com.demo.springboot.university.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Enrollment {

    @Id
    private Long enrollmentId;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student students;

   @ManyToOne
   @JoinColumn(name = "course_id")
   private Course courses;
}
