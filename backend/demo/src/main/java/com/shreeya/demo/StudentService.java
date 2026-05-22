package com.shreeya.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository repo;

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public void addStudent(Student student) {
        repo.save(student);
    }

    public void deleteStudent(int id) {
        repo.deleteById(id);
    }

    public void updateStudent(Student student) {
        repo.save(student);
    }
}