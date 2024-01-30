package com.icid.compras.demo.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icid.compras.demo.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	  List<Cliente> findByNombreContainingIgnoreCase(String nombre);


}
