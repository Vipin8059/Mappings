package com.geekster.Mapping_Assignment.controller;

import com.geekster.Mapping_Assignment.model.Branch;
import com.geekster.Mapping_Assignment.model.Course;
import com.geekster.Mapping_Assignment.model.Student;
import com.geekster.Mapping_Assignment.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;

    @PostMapping("course")
    public String addCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }

    @GetMapping("course")
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @PutMapping("course/{courseId}/{title}")
    public String updateCourseById(@PathVariable Long courseId, @PathVariable String title){
        return courseService.updateCourseById(courseId,title);
    }

    @DeleteMapping("course/{courseId}")
    public String deleteCourseById(@PathVariable Long courseId){
        return courseService.deleteCourseById(courseId);
    }
}
