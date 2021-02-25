package com.example.Midterm3275.controller;

import com.example.Midterm3275.model.model;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ourcontroller {

    @RequestMapping("/")
    public  String returnJoke(@ModelAttribute("joke") Model model){
        return "index";
    }

}
