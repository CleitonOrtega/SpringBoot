package com.example.demo.model;

import javax.persistence.*;

import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_jogador")
public class modelJogador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	@NotNull
	private String nome;
	
	@Column
	@NotNull
	private String email;
	
	@Column
	@NotNull
	private String senha;

	//Get e Set:
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
