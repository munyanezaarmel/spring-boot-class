package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, world!";
    }

    @GetMapping("/date")
    public String getDate() {
        LocalDate currentDate = LocalDate.now();
        return "Today's date is: " + currentDate;
    }
}
