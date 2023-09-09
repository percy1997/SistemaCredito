package com.credito.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.credito.entity.CreditoUsuario;

public interface CreditoUsuarioRepository extends JpaRepository<CreditoUsuario, Integer> {

}
