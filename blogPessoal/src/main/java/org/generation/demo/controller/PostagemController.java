package org.generation.demo.controller;

import java.util.List;
import java.util.Optional;

import org.generation.demo.model.postagem;

import org.generation.demo.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postagens")
@CrossOrigin("*")
public class PostagemController {

	@Autowired
	private PostagemRepository repository;
	
	@GetMapping("/postagem")
	public List<postagem> buscarTodos(){
		return repository.findAll();
	}
	
	@GetMapping("/postagem/{Id}")
	public Optional<postagem> GetById(@PathVariable long Id){
		return repository.findById(Id);
	}
	
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<postagem>> GetByTitulo(@PathVariable String titulo){
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
		
	}
	
	@PostMapping
	public ResponseEntity<postagem> post (@RequestBody postagem Postagem){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(Postagem));
	}
	
	@PutMapping
	public ResponseEntity<postagem> put (@RequestBody postagem Postagem){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(Postagem));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
