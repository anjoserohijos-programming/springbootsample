package com.example.welcome_page;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomePageController {

    @RequestMapping("")
    public String welcome(){
        return "Welcome!";
    }
}
