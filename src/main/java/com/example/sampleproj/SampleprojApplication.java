package com.example.sampleproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.example.sampleproj, com.example.welcome_page")
@SpringBootApplication
public class SampleprojApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleprojApplication.class, args);
	}

}
