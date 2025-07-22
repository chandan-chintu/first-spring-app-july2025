package com.firstapp.first_spring_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simple/apis")
public class SimpleController {

    @GetMapping("/simple1")
    public String getSimple(){
        return "This is our simple API";
    }
}
