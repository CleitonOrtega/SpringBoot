package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class hello {

	@GetMapping
	public String Hello() {
		return "As principais habilidades usadas aqui foram\npersistencia: Não desistir mesmo sendo dificil\nMentalidade de crescimento:para aprender e almejar algo a mais";
	}	
	
}
