package com.example.sismvc.repository;

import com.example.sismvc.entity.StudentScore;
import org.springframework.data.jpa.repository.JpaRepository;
public interface StudentScoreRepository extends JpaRepository<StudentScore, Integer> {}