package com.nics.loja.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "dt_nasc")
	private double dt_nasc;
	
	@Column(name = "cpf")
	private double cpf;

	public Usuario() {
	}

	public Usuario(Long id, String nome, String email, double dt_nasc, double cpf) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.dt_nasc = dt_nasc;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public double getDt_nasc() {
		return dt_nasc;
	}

	public void setDt_nasc(double dt_nasc) {
		this.dt_nasc = dt_nasc;
	}
	
	public double getCpf(double cpf) {
		return cpf;
	}

	public void setCpf(double cpf) {
		this.cpf = cpf;
	}


}