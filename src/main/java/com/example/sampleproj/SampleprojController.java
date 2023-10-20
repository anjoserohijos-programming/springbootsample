package com.example.sampleproj;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleprojController {

    @RequestMapping("")
    public String sayHi(){
         return "Hello";
    }
}
