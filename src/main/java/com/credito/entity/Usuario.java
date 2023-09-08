package com.credito.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_usu")
	private Integer codigoUsuario;
	
	@Column(name = "nom_usu")
	private String nombreUsuario;
	
	@Column(name = "ape_usu")
	private String apellidoUsuario;
	
	@Column(name = "dni_usu")
	private int dniUsuario;

}
