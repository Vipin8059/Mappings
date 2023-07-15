package com.geekster.Mapping_Assignment.controller;

import com.geekster.Mapping_Assignment.model.Branch;
import com.geekster.Mapping_Assignment.model.Student;
import com.geekster.Mapping_Assignment.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("student")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping("students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PutMapping("student/{studentId}/{branch}")
    public String updateStudentById(@PathVariable Long studentId, @PathVariable Branch branch){
        return studentService.updateStudentById(studentId,branch);
    }

    @DeleteMapping("studnet/{studentId}")
    public String deleteStudentById(@PathVariable Long studentId){
        return studentService.deleteStudentById(studentId);
    }
}
