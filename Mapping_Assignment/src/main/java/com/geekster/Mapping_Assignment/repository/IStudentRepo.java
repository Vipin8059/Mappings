package com.geekster.Mapping_Assignment.repository;

import com.geekster.Mapping_Assignment.model.Address;
import com.geekster.Mapping_Assignment.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepo extends JpaRepository<Student,Long> {
}
