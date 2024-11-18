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

import com.nics.loja.entities.Perfildeusuario;
import com.nics.loja.services.PerfildeusuarioService;

@RestController
@RequestMapping("/perfildeusuario")
public class PerfildeusuarioController {
	

	@Autowired
	private PerfildeusuarioService perfildeusuarioService;

	@PostMapping
	public Perfildeusuario createPerfildeusuario(@RequestBody Perfildeusuario perfildeusuario) {
		return perfildeusuarioService.savePerfildeusuario(perfildeusuario);
	}
	
	@PutMapping
	public Perfildeusuario editPerfildeusuario(@RequestBody Perfildeusuario perfildeusuario) {
		return perfildeusuarioService.savePerfildeusuario(perfildeusuario);
	}

	@GetMapping
	public List<Perfildeusuario> getAllPerfildeusuario() {
		return perfildeusuarioService.getAllPerfildeusuario();
	}

	@GetMapping("/{id}")
	public Perfildeusuario getPerfildeusuario(@PathVariable Long id) {
		return perfildeusuarioService.getPerfildeusuarioById(id);
	}

	@DeleteMapping("/{id}")
	public void deletePerfildeusuario(@PathVariable Long id) {
		perfildeusuarioService.deletePerfildeusuario(id);
	}
}