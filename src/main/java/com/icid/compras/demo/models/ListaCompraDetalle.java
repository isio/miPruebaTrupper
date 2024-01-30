package com.icid.compras.demo.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "LISTA_COMPRA_DETALLES")
public class ListaCompraDetalle implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idLista")
	private ListaCompra lista_compra;

	@Id
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idProducto")
	private Producto productos;
	
	@JsonIgnoreProperties(value={"lista_compra", "hibernateLazyInitializer", "handler"}, allowSetters = true)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idLista")
	private ListaCompra lista_compra_;

	@JsonIgnoreProperties(value={"lista_compra", "hibernateLazyInitializer", "handler"}, allowSetters = true)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idProducto")
	private Producto productos_;
	
	@Column(name = "cantidad")
	private int cantidad;

	public ListaCompraDetalle() {
	}

	public ListaCompraDetalle(ListaCompra lista_compra, Producto productos, ListaCompra lista_compra_,
			Producto productos_, int cantidad) {
		this.lista_compra = lista_compra;
		this.productos = productos;
		this.lista_compra_ = lista_compra_;
		this.productos_ = productos_;
		this.cantidad = cantidad;
	}

	public ListaCompra getLista_compra() {
		return lista_compra;
	}

	public void setLista_compra(ListaCompra lista_compra) {
		this.lista_compra = lista_compra;
	}

	public Producto getProductos() {
		return productos;
	}

	public void setProductos(Producto productos) {
		this.productos = productos;
	}

	public ListaCompra getLista_compra_() {
		return lista_compra_;
	}

	public void setLista_compra_(ListaCompra lista_compra_) {
		this.lista_compra_ = lista_compra_;
	}

	public Producto getProductos_() {
		return productos_;
	}

	public void setProductos_(Producto productos_) {
		this.productos_ = productos_;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "ListaCompraDetalle [lista_compra=" + lista_compra + ", productos=" + productos + ", lista_compra_="
				+ lista_compra_ + ", productos_=" + productos_ + ", cantidad=" + cantidad + "]";
	}
	
}
