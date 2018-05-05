package com.cecylopez.MantenimientoProducto.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="producto", schema="MantenimientoProducto")
public class Producto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long codigo;
	String nombre;
	long cantidadExistencia;
	long precioUnitario;
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
	public long getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(long precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", cantidadExistencia=" + cantidadExistencia
				+ ", precioUnitario=" + precioUnitario + "]";
	}
	
	

}
