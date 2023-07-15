package com.geekster.Mapping_Assignment.repository;

import com.geekster.Mapping_Assignment.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepo extends JpaRepository<Course,Long> {
}
