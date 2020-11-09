package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.modelJogador;
import com.example.demo.repository.repositoryJogador;

@RestController
@RequestMapping("/jogador")
public class controllerJogador {

	@Autowired
	private repositoryJogador repository;

	@GetMapping
	public List<modelJogador> buscarTodos(){
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<modelJogador> GetById(@PathVariable long id){
		return repository.findById(id);
	}

	@PostMapping
	public ResponseEntity<modelJogador> post (@RequestBody modelJogador Jogador){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(Jogador));
	}
	
	@PutMapping
	public ResponseEntity<modelJogador> put (@RequestBody modelJogador Jogador){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(Jogador));
	}
	
	@DeleteMapping("/delete.{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}


}
