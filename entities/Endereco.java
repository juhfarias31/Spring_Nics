package com.nics.loja.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_endereco")
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "cidade")
	private String cidade;
	
	@Column(name = "cep")
	private double cep;
	
	@Column(name = "rua")
	private String rua;
	
	@Column(name = "bairro")
	private String bairro;
	
	@Column(name = "num")
	private double num;
	
	@Column(name = "complemento")
	private String complemento;

	public Endereco() {
	}

	public Endereco(Long id, String cidade, double cep, String rua, String bairro, double num, String complemento) {
		this.id = id;
		this.cidade = cidade;
		this.cep = cep;
		this.rua = rua;
		this.bairro = bairro;
		this.num = num;
		this.complemento = complemento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public double getCep() {
		return cep;
	}

	public void setCep(double cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public double getNum() {
		return num;
	}

	public void setNum(double num) {
		this.num = num;
	}
	
	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

}