package com.example.sismvc.entity;


import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "student_t")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;

    @Column(name = "student_code", nullable = false)
    private String studentCode;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    private String address;

    // Add One-to-Many relationship with StudentScore
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<StudentScore> studentScores;

    // Getters and Setters
    public int getStudentId() { return studentId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }
    public String getStudentCode() { return studentCode; }
    public void setStudentCode(String studentCode) { this.studentCode = studentCode; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public List<StudentScore> getStudentScores() { return studentScores; }
    public void setStudentScores(List<StudentScore> studentScores) { this.studentScores = studentScores; }
}