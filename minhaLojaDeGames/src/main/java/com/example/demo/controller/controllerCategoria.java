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

import com.example.demo.model.modelCategoria;
import com.example.demo.repository.repositoryCategoria;

@RestController
@RequestMapping("/categoria")
public class controllerCategoria {

	@Autowired
	private repositoryCategoria repository;
	
	@GetMapping
	public List<modelCategoria> buscarTodos(){
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<modelCategoria> GetById(@PathVariable long id){
		return repository.findById(id);
	}
	
	@GetMapping("/nome.{categoria}")
	public ResponseEntity<List<modelCategoria>> GetByTitulo(@PathVariable String categoria){
		return ResponseEntity.ok(repository.findAllBycategoriaContainingIgnoreCase(categoria));	
	}
	
	@PostMapping
	public ResponseEntity<modelCategoria> post (@RequestBody modelCategoria Categoria){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(Categoria));
	}
	
	@PutMapping
	public ResponseEntity<modelCategoria> put (@RequestBody modelCategoria Categoria){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(Categoria));
	}
	
	@DeleteMapping("/delete.{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	
}
