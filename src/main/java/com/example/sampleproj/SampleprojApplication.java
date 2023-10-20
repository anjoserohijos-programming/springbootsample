package com.example.sampleproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping(value ="/")
@ComponentScan(basePackages = "com.example.sampleproj")
@SpringBootApplication
public class SampleprojApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleprojApplication.class, args);
		System.out.println("SampleProjApplication WORKED?");
	}

}
