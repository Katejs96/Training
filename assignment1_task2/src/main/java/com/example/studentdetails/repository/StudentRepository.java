package com.example.studentdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.studentdetails.domain.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
