package com.example.aopdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/TestAOP")
    public String welcome() {
        System.out.println("Welcome to SpringBoot AOP..");
        return "hii";
    }
}
