package com.icid.compras.demo.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRODUCTOS")
public class Producto implements Serializable  {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProducto;
	
	@Column(name = "clave")
	private String clave;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "activo")
	private boolean activo;
	
	public Producto() {
	}

	public Producto(String clave, String descripcion, boolean activo) {
		this.clave = clave;
		this.descripcion = descripcion;
		this.activo = activo;
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "productos [idProducto=" + idProducto + ", clave=" + clave + ", descripcion=" + descripcion + ", activo="
				+ activo + "]";
	}
	
	
	
	

}
