package com.credito.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credito.dao.UsuarioRepository;

@Service
public class UsuarioServices {

	@Autowired
	private UsuarioRepository repo;
	
	public int obtenerCodigoPorDni(int dni) {	
		return repo.obtenerCodigoUsuario(dni);
	}
	
}
