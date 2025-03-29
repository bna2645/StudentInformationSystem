package com.example.sismvc.repository;

import com.example.sismvc.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
public interface SubjectRepository extends JpaRepository<Subject, Integer> {}