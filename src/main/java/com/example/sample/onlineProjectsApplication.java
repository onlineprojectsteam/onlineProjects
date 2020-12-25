package com.example.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class onlineProjectsApplication {

	public static void main(String[] args) {
		SpringApplication.run(onlineProjectsApplication.class, args);
	}

}
