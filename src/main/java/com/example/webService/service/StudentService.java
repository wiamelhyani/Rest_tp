package com.example.webService.service;
import com.example.webService.entities.Student;
import com.example.webService.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/students")
    public String Hello() {
        return "Hello ALL";
    }

    @GetMapping("/students/all")
    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }

    @PostMapping("/students")
    public void addStudent(@RequestBody Student std) {
        studentRepository.save(std);
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable ("id") Long id) {
        return studentRepository.findById(id).get();
    }


    @DeleteMapping("/students/delete/{id}")
    public void deletStudent(@PathVariable("id") Long id) {
        studentRepository.deleteById(id);
    }


    @GetMapping("/students/v1/{name}")
    public List<Student> getStudentsByName(@PathVariable ("name") String fn){
        return studentRepository.findByFirstName(fn);
    }

}
