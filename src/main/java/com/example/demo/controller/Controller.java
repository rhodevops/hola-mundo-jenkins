package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping
	public String saludo() {
		
		return "Hola mundo, hola jenkins, hola blueocean";
	}

}
