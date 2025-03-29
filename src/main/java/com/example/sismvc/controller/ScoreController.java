package com.example.sismvc.controller;

import com.example.sismvc.entity.StudentScore;
import com.example.sismvc.repository.StudentRepository;
import com.example.sismvc.repository.StudentScoreRepository;
import com.example.sismvc.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/scores")
public class ScoreController {
    @Autowired
    private StudentScoreRepository scoreRepository;
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private SubjectRepository subjectRepository;

    @GetMapping("/add")
    public String showAddScoreForm(Model model) {
        model.addAttribute("score", new StudentScore());
        model.addAttribute("students", studentRepository.findAll());
        model.addAttribute("subjects", subjectRepository.findAll());
        return "score_form";
    }

    @PostMapping("/add")
    public String addScore(@ModelAttribute StudentScore score) {
        scoreRepository.save(score);
        return "redirect:/students";
    }
}
