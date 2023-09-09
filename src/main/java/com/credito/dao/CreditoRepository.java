package com.credito.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.credito.entity.Credito;

public interface CreditoRepository extends JpaRepository<Credito, Integer>{
	

}
