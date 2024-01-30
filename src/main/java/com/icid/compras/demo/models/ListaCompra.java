package com.icid.compras.demo.models;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "LISTA_COMPRAS")
public class ListaCompra implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLista;
	
	@JsonIgnoreProperties(value={"lista_compra", "hibernateLazyInitializer", "handler"}, allowSetters = true)
	@ManyToOne(fetch = FetchType.LAZY)
	private Cliente cliente;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "fecha_registro")
	@Temporal(TemporalType.DATE)
	private Date fecha_registro;
	
	@Column(name = "fecha_ultima_actualizacion")
	@Temporal(TemporalType.DATE)
	private Date fecha_ultima_actualizacion;
	
	@Column(name = "activo")
	private boolean activo;

	public ListaCompra() {
	}

	public ListaCompra(Long idLista, Cliente cliente, String nombre, Date fecha_registro,
			Date fecha_ultima_actualizacion, boolean activo) {
		this.idLista = idLista;
		this.cliente = cliente;
		this.nombre = nombre;
		this.fecha_registro = fecha_registro;
		this.fecha_ultima_actualizacion = fecha_ultima_actualizacion;
		this.activo = activo;
	}

	public Long getIdLista() {
		return idLista;
	}

	public void setIdLista(Long idLista) {
		this.idLista = idLista;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	public Date getFecha_ultima_actualizacion() {
		return fecha_ultima_actualizacion;
	}

	public void setFecha_ultima_actualizacion(Date fecha_ultima_actualizacion) {
		this.fecha_ultima_actualizacion = fecha_ultima_actualizacion;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "lista_compra [idLista=" + idLista + ", cliente=" + cliente + ", nombre=" + nombre + ", fecha_registro="
				+ fecha_registro + ", fecha_ultima_actualizacion=" + fecha_ultima_actualizacion + ", activo=" + activo
				+ "]";
	}
	
}
