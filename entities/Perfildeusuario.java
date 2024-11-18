package com.nics.loja.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_perfildeusuario")
public class Perfildeusuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "tipo_permissão")
	private double tipo_permissão;
	
	@Column(name = "cpf")
	private double cpf;

	public Perfildeusuario() {
	}

	public Perfildeusuario(Long id, String nome, double tipo_permissão, double cpf) {
		this.id = id;
		this.nome = nome;
		this.tipo_permissão = tipo_permissão;
		this.cpf = cpf;
	}

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

	public double getTipo_permissão() {
		return tipo_permissão;
	}

	public void setTipo_permissão(double tipo_permissão) {
		this.tipo_permissão = tipo_permissão;
	}
	
	public double getCpf() {
		return cpf;
	}

	public void setCpf(double cpf) {
		this.cpf = cpf;
	}



}
