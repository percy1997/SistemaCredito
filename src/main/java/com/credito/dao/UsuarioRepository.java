package com.credito.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.credito.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
