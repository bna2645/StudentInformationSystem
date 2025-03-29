package com.example.sismvc.controller;

import com.example.sismvc.entity.Subject;
import com.example.sismvc.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/subjects")
public class SubjectController {
    @Autowired
    private SubjectRepository subjectRepository;

    // Display list of subjects (optional, for completeness)
    @GetMapping
    public String listSubjects(Model model) {
        model.addAttribute("subjects", subjectRepository.findAll());
        return "subject_list";
    }

    // Show form to add a new subject
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("subject", new Subject());
        return "subject_form";
    }

    // Handle form submission to add a subject
    @PostMapping("/add")
    public String addSubject(@ModelAttribute Subject subject) {
        subjectRepository.save(subject);
        return "redirect:/subjects"; // Redirect to subject list or wherever you prefer
    }
}