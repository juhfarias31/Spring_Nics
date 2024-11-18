package com.nics.loja.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "preco")
	private double preco;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "categoria")
	private String categoria;
	
	@Column(name = "estoque")
	private String estoque;

	public Produto() {
	}

	public Produto(Long id, String nome, double preco, String descricao, String categoria, String estoque) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
		this.categoria = categoria;
		this.estoque = estoque;
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

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getCategoria() {
		return preco;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getEstoque() {
		return estoque;
	}

	public void setEstoque(String estoque) {
		this.estoque = estoque;
	}


}
