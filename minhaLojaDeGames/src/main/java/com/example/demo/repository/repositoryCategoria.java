package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.modelCategoria;

public interface repositoryCategoria extends JpaRepository<modelCategoria, Long> {

	public List<modelCategoria> findAllBycategoriaContainingIgnoreCase (String categoria);

}
