package com.example.sismvc.repository;

import com.example.sismvc.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
public interface StudentRepository extends JpaRepository<Student, Integer> {}