package com.credito.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.credito.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	@Query("select u.codigoUsuario from Usuario u where u.dniUsuario =?1")
	public int obtenerCodigoUsuario(int dni);	
}
