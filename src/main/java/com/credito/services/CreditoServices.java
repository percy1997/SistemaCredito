package com.credito.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credito.dao.CreditoRepository;
import com.credito.entity.Credito;

@Service
public class CreditoServices {
	
	@Autowired
	private CreditoRepository repo;
	
	//listar creditos
	public List<Credito> listaCreditos(){
		return repo.findAll();
	}

}
