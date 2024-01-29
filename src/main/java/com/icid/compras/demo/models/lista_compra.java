package com.icid.compras.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "lista_compra")
public class lista_compra {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLista;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private clientes cliente;
	
	@Column(name = "nombre")
	private String nombre;
	
	
	
}
