package com.example.demo.repository;

import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    @Query(value="select * from Student ", nativeQuery = true)
    public List<Student> getStudents();
}
