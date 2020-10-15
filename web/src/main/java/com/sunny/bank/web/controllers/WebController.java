package com.sunny.bank.web.controllers;

import com.sunny.bank.main.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class WebController {
    @Autowired
    TestService service;

    @GetMapping("/time")
    public String checkTime()
    {
        return LocalDateTime.now().toString();
    }
}
