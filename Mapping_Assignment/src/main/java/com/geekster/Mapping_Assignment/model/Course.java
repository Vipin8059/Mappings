package com.geekster.Mapping_Assignment.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;

    private String courseTitle;

    private String courseDescription;

    private String courseDuration;

    @ManyToMany
    @JoinColumn(name = "fk_student_id")
    private List<Student> studentList;
}
