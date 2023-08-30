package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/hello")
public class Aula03Application {

	public static void main(String[] args) {
		SpringApplication.run(Aula03Application.class, args);
	}

	@GetMapping("/") //localhost:8080/hello
	public String hello(){
		return "hello";
	}

}
