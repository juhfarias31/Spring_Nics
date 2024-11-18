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

import com.nics.loja.entities.Formapag;
import com.nics.loja.services.FormapagService;

@RestController
@RequestMapping("/formapag")
public class FormapagController {
	

	@Autowired
	private 	FormapagService formapagService;

	@PostMapping
	public Formapag createFormapag(@RequestBody Formapag formapag) {
		return formapagService.saveFormapag(formapag);
	}
	
	@PutMapping
	public Formapag editFormapag(@RequestBody Formapag formapag) {
		return formapagService.saveFormapag(formapag);
	}

	@GetMapping
	public List<Formapag> getAllFormapag() {
		return formapagService.getAllFormapag();
	}

	@GetMapping("/{id}")
	public Formapag getFormapag(@PathVariable Long id) {
		return formapagService.getFormapagById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteFormapag(@PathVariable Long id) {
		formapagService.deleteFormapag(id);
	}
}