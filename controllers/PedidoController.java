package com.nics.loja.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nics.loja.entities.Pedido;
import com.nics.loja.services.PedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoController {
	

	@Autowired
	private PedidoService pedidoService;

	@PostMapping
	public Pedido createPedido(@RequestBody Pedido pedido) {
		return pedidoService.savePedido(pedido);
	}
	
	@PutMapping
	public Pedido editPedido(@RequestBody Pedido pedido) {
		return pedidoService.savePedido(pedido);
	}

	@GetMapping
	public List<Pedido> getAllPedido() {
		return pedidoService.getAllPedido();
	}

	@GetMapping("/{id}")
	public Pedido getPedido(@PathVariable Long id) {
		return pedidoService.getPedidoById(id);
	}

	@DeleteMapping("/{id}")
	public void deletePedido(@PathVariable Long id) {
		pedidoService.deletePedido(id);
	}
}