package com.icid.compras.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class clientes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCliente;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "activo")
	private boolean activo;

	public clientes() {
	}

	public clientes(Long idCliente, String nombre, boolean activo) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.activo = activo;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "clientes [idCliente=" + idCliente + ", nombre=" + nombre + ", activo=" + activo + "]";
	}

}
