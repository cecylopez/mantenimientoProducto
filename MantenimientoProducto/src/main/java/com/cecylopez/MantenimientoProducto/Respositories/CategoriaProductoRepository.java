package com.cecylopez.MantenimientoProducto.Respositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cecylopez.MantenimientoProducto.entities.CategoriaProducto;

public interface CategoriaProductoRepository extends JpaRepository<CategoriaProducto, Integer> {
	CategoriaProducto findByCodigo(int codigo);
	List<CategoriaProducto> findByNombre(String nombre);
}
