package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello2")
public class Hello2 {

	@GetMapping
	public String hello() {
		return "Os objetivos de aprendizagem esta semana foram começar com o Spring sem grandes problemas\nE entender oque estava ocorrendo e foi alcançado!";
	}	
	
}
