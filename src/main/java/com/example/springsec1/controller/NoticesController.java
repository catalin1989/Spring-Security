package com.example.springsec1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {

    @GetMapping("/notices")
    public String welcome(){
        return "Here are the notices details from the DB";
    }
}
