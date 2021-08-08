package com.demo05.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class REstController {


    @GetMapping
    public String Mnesaje (){
        return "Esto es con gradle";
    }
}
