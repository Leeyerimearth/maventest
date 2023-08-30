package com.example.maventest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home() {
        System.out.println("--home--");
        return "testMaven";
    }
}
