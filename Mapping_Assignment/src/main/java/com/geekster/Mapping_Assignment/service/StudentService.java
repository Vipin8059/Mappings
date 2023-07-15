package com.geekster.Mapping_Assignment.service;

import com.geekster.Mapping_Assignment.model.Branch;
import com.geekster.Mapping_Assignment.model.Student;
import com.geekster.Mapping_Assignment.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    IStudentRepo studentRepo;
    public String addStudent(Student student) {
        studentRepo.save(student);
        return "student added successfully";
    }
    public List<Student> getAllStudents() {
        return studentRepo.findAll();

    }

    public String updateStudentById(Long studentId, Branch branch) {
        Student student = studentRepo.findById(studentId).orElse(null);
        if(student!=null){
            student.setBranch(branch);
            studentRepo.save(student);
            return "student updated successfully";
        }
        else{
            return "unable to update student";
        }

    }

    public String deleteStudentById(Long studentId) {
        studentRepo.deleteById(studentId);
        return "student  deleted successfully";
    }
}
