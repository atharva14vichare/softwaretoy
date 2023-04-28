package com.atharva.toysystem.controller;

import com.atharva.toysystem.model.Child;
import com.atharva.toysystem.service.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/child")
@CrossOrigin
public class ChildController {
    @Autowired
    private ChildService childservice;


    @PostMapping("/add")
    public String add (@RequestBody Child child){
        System.out.println("New Request Received");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        childservice.saveChild(child);
        return "New Child Entry Added";
    }

    @GetMapping("/getAll")
    public List<Child> getAllChildren(){
            return childservice.getAllChildren();
    }
}
