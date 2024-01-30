package com.icid.compras.demo.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icid.compras.demo.models.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
	List<Producto> findByClaveContainingIgnoreCase(String clave);
}
