package com.sunny.bank.payment.system.india.nach.nachpayment.controller;

import com.sunny.bank.main.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

@RestController
public class TestController {

    @Autowired
    TestService service;

    @GetMapping("/nachapptime")
    public String checkTime()
    {
        return LocalDateTime.now().toString();
    }
}