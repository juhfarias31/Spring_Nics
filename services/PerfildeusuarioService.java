package com.nics.loja.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nics.loja.entities.Perfildeusuario;
import com.nics.loja.repositories.PerfildeusuarioRepository;


@Service
public class PerfildeusuarioService {
	
	@Autowired
	private PerfildeusuarioRepository perfildeusuarioRepository;
	
	public Perfildeusuario savePerfildeusuario( Perfildeusuario perfildeusuario) {
		return perfildeusuarioRepository.save(perfildeusuario);
	}
	
	public List<Perfildeusuario> getAllPerfildeusuario(){
		return perfildeusuarioRepository.findAll();
	}
	
	public Perfildeusuario getPerfildeusuarioById (Long id) {
		return perfildeusuarioRepository.findById(id).orElse(null);
	}
	
	public void deletePerfildeusuario(Long id) {
		perfildeusuarioRepository.deleteById(id);
	}


}
