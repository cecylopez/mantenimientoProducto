package com.cecylopez.MantenimientoProducto.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Producto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int codigo;
	String nombre;
	@Column(name="cantidad_existencia")
	long cantidadExistencia;
	@Column(name="precio_unitario")
	long precioUnitario;
	int categoria;
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
	public long getCantidadExistencia() {
		return cantidadExistencia;
	}
	public void setCantidadExistencia(long cantidadExistencia) {
		this.cantidadExistencia = cantidadExistencia;
	}
	public long getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(long precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", cantidadExistencia=" + cantidadExistencia
				+ ", precioUnitario=" + precioUnitario + ", categoria=" + categoria + "]";
	}
	
}
