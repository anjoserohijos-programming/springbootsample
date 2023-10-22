package com.example.account;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    
    @RequestMapping("/accounts")
    public Account showAccount(){
        return new Account(0, "anjoser", "anjoanjoanjo", "Anjo", "Serohijos");
    }
}
