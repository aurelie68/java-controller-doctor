package com.wildcodeschool.myProject1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequestMapping("/doctor")
public class DoctorController {

    @GetMapping("/1")
    public String firstDoctor(Model model) {
        model.addAttribute("doctorName", "William Hartnell");
        return "doctor";
    }

    @GetMapping("/10")
    public String tenthDoctor(Model model) {
        model.addAttribute("doctorName", "David Tennant");
        return "doctor";
    }

    @GetMapping("/13")
    public String thirteenthDoctor(Model model) {
        model.addAttribute("doctorName", "Jodie Whittaker");
        return "doctor";
    }
}
