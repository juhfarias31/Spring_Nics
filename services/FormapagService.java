package com.nics.loja.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nics.loja.entities.Formapag;
import com.nics.loja.repositories.FormapagRepository;


@Service
public class FormapagService {
	
	@Autowired
	private FormapagRepository formapagRepository;
	
	public Formapag saveFormapag( Formapag formapag) {
		return formapagRepository.save(formapag);
	}
	
	public List<Formapag> getAllFormapag(){
		return formapagRepository.findAll();
	}
	
	public Formapag getFormapagById (Long id) {
		return formapagRepository.findById(id).orElse(null);
	}
	
	public void deleteFormapag(Long id) {
		formapagRepository.deleteById(id);
	}


}
