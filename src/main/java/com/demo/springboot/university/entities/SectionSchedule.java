package com.demo.springboot.university.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SectionSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "section_id")
    private CourseSection courseSection;

    @Enumerated(EnumType.STRING)
    private DayOfWeek dayOfWeek;



    private LocalTime startTime;
    private Duration duration;
    private LocalTime endTime;

}
