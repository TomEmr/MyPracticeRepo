package com.example.springsecurity.controllers;

import com.example.springsecurity.models.Student;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> students = new ArrayList<>();

    @GetMapping("/students")
    public List<Student> students() {
        Student student1 = new Student(1L, "James", "Bond");
        Student student2 = new Student(2L, "Maria", "Jones");
        students.add(student1);
        students.add(student2);
        return students;
    }


    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }
}
