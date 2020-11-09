package com.example.demo.model;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_produtos")
public class modelProdutos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	@Size(min = 3,max = 30)
	private String nome;
	
	@Column
	@JsonFormat(pattern="yyy-mm-dd")
	private Date dataLanc;

	@ManyToOne
	@JsonIgnoreProperties("modelProdutos")
	private modelCategoria categoria;
	
	//Get e Set:
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataLanc() {
		return dataLanc;
	}

	public void setDataLanc(Date dataLanc) {
		this.dataLanc = dataLanc;
	}

	public modelCategoria getCategoria() {
		return categoria;
	}

	public void setCategoria(modelCategoria categoria) {
		this.categoria = categoria;
	}
	
}
