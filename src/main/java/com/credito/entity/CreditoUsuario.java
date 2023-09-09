package com.credito.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "credito_usuario")
public class CreditoUsuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_creusu")
	private Integer codigoPrestamo;
	
	@Column(name = "can_creusu")
	private double cantidadPrestamo;

	@Column(name = "fec_creusu")
	private String fechaPrestamo;	
	
	@ManyToOne
	@JoinColumn(name="cod_usu")
	private Usuario usuario;
}
