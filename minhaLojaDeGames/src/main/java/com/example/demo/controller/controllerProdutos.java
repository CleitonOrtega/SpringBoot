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

import com.example.demo.model.modelProdutos;
import com.example.demo.repository.repositoryProdutos;

@RestController
@RequestMapping("/produtos")
public class controllerProdutos {

	@Autowired
	private repositoryProdutos repository;

	@GetMapping
	public List<modelProdutos> buscarTodos(){
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<modelProdutos> GetById(@PathVariable long id){
		return repository.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<modelProdutos> post (@RequestBody modelProdutos Produtos){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(Produtos));
	}
	
	@PutMapping
	public ResponseEntity<modelProdutos> put (@RequestBody modelProdutos Produtos){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(Produtos));
	}
	
	@DeleteMapping("/delete.{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	
	
	
}
