package com.example.demo;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    StudentRepository studentRepository;

    @Test
    public void getStudent(){

        Student student  = studentRepository.getStudentByLastName("Nghia");
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        System.out.println(student.getEmail());
        System.out.println(student.getPhone());
    }



}
