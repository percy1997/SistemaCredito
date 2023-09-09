package com.credito.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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

	@OneToMany(mappedBy = "usuario")
	@JsonIgnore
	List<CreditoUsuario> listaCreditosUsuario;
}
