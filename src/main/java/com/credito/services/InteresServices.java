package com.credito.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credito.dao.InteresRepository;
import com.credito.entity.Interes;

@Service
public class InteresServices {

	@Autowired
	private InteresRepository repo;
	
	//listar
	public List<Interes> listarInteres(){
		return repo.findAll();
	}
	
	//obtener INTERES por codigo
	public Interes interesPorCodigo(int cod) {
		return repo.findById(cod).orElse(null);
	}
	
}
