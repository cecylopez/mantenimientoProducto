package com.cecylopez.MantenimientoProducto.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CategoriaProducto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long codigo;
	String nombre;
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "CategoriaProducto [codigo=" + codigo + ", nombre=" + nombre + "]";
	}
	

}
