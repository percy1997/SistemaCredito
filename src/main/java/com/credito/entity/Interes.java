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
@Table(name = "interes")
public class Interes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_int")
	private Integer codigoInteres;
	
	@Column(name = "can_int")
	private String cantidadInteres;

	@Column(name = "val_int")
	private double valorInteres;
	
	@Column(name = "dia_int")
	private String diaInteres;
}
