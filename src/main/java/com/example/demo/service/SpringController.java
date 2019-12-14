package com.example.demo.service;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
 	@RequestMapping("/")
	public String welcome() {
		return "It Worked !!";
	}
	
	@RequestMapping("/hello")
	public String myData() {
		return "Hello Spring Boot!";
		
        }
}
