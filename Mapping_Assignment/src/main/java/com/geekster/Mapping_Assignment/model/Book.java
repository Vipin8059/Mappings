package com.geekster.Mapping_Assignment.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;

    private String bookTitle;

    private String bookAuthor;

    private String bookDescription;

    private String bookPrice;

    @ManyToOne
    @JoinColumn(name = "fk_student_id")
    private Student student;
}
