package com.credito.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credito.dao.CreditoUsuarioRepository;
import com.credito.entity.CreditoUsuario;

@Service
public class CreditoUsuarioServices {

	@Autowired
	private CreditoUsuarioRepository repo;
	
	//registrar nuevo CREDITOUSUARIO (prestamo)
	public void registrarPrestamo(CreditoUsuario cu) {
		repo.save(cu);
	}
}
