package com.example.demo.model;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_categoria")
public class modelCategoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String categoria;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<modelProdutos> modelProdutos;

	//Get e Set:

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public List<modelProdutos> getModelProdutos() {
		return modelProdutos;
	}

	public void setModelProdutos(List<modelProdutos> modelProdutos) {
		this.modelProdutos = modelProdutos;
	}
	
}
