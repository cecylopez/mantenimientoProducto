package com.cecylopez.MantenimientoProducto.Respositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cecylopez.MantenimientoProducto.entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
	Producto findByCodigo(int codigo);
	List<Producto> findByNombre(String nombre);
	List<Producto> findByNombreLikeIgnoreCase(String nombre);
}
