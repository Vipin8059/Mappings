package com.geekster.Mapping_Assignment.service;

import com.geekster.Mapping_Assignment.model.Course;
import com.geekster.Mapping_Assignment.repository.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    ICourseRepo courseRepo;

    public String addCourse(Course course) {
        courseRepo.save(course);
        return "course added successfully";

    }

    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    public String updateCourseById(Long courseId, String title) {
        Course course = courseRepo.findById(courseId).orElse(null);
        if(course!=null){
            course.setCourseTitle(title);
            courseRepo.save(course);
            return "course updated successfully";
        }
        return "unable to update course";
    }

    public String deleteCourseById(Long courseId) {
        courseRepo.deleteById(courseId);
        return "course removed successfully";
    }
}
