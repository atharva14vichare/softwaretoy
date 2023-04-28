package com.atharva.toysystem.controller;

import com.atharva.toysystem.model.Senior;
import com.atharva.toysystem.service.SeniorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/senior")
@CrossOrigin
public class SeniorController {
    @Autowired
    private SeniorService seniorservice;


    @PostMapping("/add")
    public String add (@RequestBody Senior senior){
        System.out.println("New Request Received");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println(senior.getName());
        seniorservice.saveSenior(senior);
        return "New Senior Citizen  Entry Added";
    }

    @GetMapping("/getAll")
    public List<Senior> getAllSeniors(){
        return seniorservice.getAllSeniors();
    }
}
