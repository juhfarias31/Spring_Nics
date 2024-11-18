package com.nics.loja.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pedido")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "valorTotal")
	private double valorTotal;
	
	@Column(name = "dt_pedido")
	private double dt_pedido;
	
	@Column(name = "prazo")
	private double prazo;

	public Pedido() {
	}

	public Pedido(Long id, double valorTotal, double dt_pedido, double prazo) {
		this.id = id;
		this.valorTotal = valorTotal;
		this.dt_pedido = dt_pedido;
		this.prazo = prazo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public double getDt_pedido() {
		return valorTotal;
	}

	public void setDt_pedido(double dt_pedido) {
		this.dt_pedido = dt_pedido;
	}

	public double getPrazo() {
		return prazo;
	}

	public void setPrazo(double prazo) {
		this.prazo = prazo;
	}


}
