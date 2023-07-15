package com.geekster.Mapping_Assignment.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    private String name;

    private Integer age;

    private String phoneNumber;

    private Branch branch;

    private String department;

    @OneToOne
    @JoinColumn(name = "fk_Address_id")
    private Address address;
}
