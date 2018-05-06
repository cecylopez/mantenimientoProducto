package com.cecylopez.MantenimientoProducto.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Producto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long codigo;
	String nombre;
	@Column(name="cantidad_existencia")
	long cantidadExistencia;
	@Column(name="precio_unitario")
	BigDecimal precioUnitario;
	@ManyToOne()
	CategoriaProducto categoria;
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getCantidadExistencia() {
		return cantidadExistencia;
	}
	public void setCantidadExistencia(long cantidadExistencia) {
		this.cantidadExistencia = cantidadExistencia;
	}
	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public CategoriaProducto getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaProducto categoria) {
		this.categoria = categoria;
	}
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", cantidadExistencia=" + cantidadExistencia
				+ ", precioUnitario=" + precioUnitario + ", categoria=" + categoria + "]";
	}
	
}
