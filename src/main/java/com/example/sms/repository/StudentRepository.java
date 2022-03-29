package com.example.sms.repository;


import com.example.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

// first parameter is the type of JPA entity
// the second type parameter is primary key
public interface StudentRepository extends JpaRepository<Student, Long > {
}
