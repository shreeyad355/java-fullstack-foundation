package com.shreeya.demo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class HomeController {

    @Autowired
    StudentService service;

    @GetMapping("/")
    public String home() {
        return "Spring Boot Working";
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return service.getAllStudents();
    }
    
    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id) {

        service.deleteStudent(id);

        return "Student Deleted Successfully";
    }

    @PutMapping("/students")
    public String updateStudent(@RequestBody Student student) {

        service.updateStudent(student);

        return "Student Updated Successfully";
    }
    
    @PostMapping("/students")
    public String addStudent(@RequestBody Student student) {

        service.addStudent(student);

        return "Student Added Successfully";
    }
}