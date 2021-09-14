package com.example.demo;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    StudentRepository studentRepository;

    @Test
    public void insertSinhVien(){
        Student student = Student.builder()
                .firstName("Nguyen Thanh ")
                .lastName("Nghia")
                .email("anhdung@")
                .phone("1234567")
                .build();
        studentRepository.save(student);

    }

}
