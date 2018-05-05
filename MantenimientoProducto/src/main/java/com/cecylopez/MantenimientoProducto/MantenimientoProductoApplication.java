package com.cecylopez.MantenimientoProducto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.kastkode.springsandwich.filter", "com.cecylopez.MantenimientoProducto.controllers"})
public class MantenimientoProductoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MantenimientoProductoApplication.class, args);
	}
}
