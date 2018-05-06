package com.cecylopez.MantenimientoProducto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cecylopez.MantenimientoProducto.Respositories.CategoriaProductoRepository;
import com.cecylopez.MantenimientoProducto.Respositories.ProductoRepository;
import com.cecylopez.MantenimientoProducto.entities.CategoriaProducto;
import com.cecylopez.MantenimientoProducto.entities.Producto;

@RestController
@RequestMapping("/productos")
public class ProductoController {
	@Autowired
	public ProductoRepository productoRepo;
	
	@Autowired
	public CategoriaProductoRepository cateRepo;

	@RequestMapping(method = RequestMethod.GET, path = "/")
	public ResponseEntity<List<Producto>> listProductos() {
		List<Producto> listaProductos = productoRepo.findAllByOrderByCodigoAsc();
		return new ResponseEntity<List<Producto>>(listaProductos, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/categorias")
	public ResponseEntity<List<CategoriaProducto>> getCategorias() {
		return new ResponseEntity<List<CategoriaProducto>>(cateRepo.findAll(), HttpStatus.OK);
	}
	

	@RequestMapping(method = RequestMethod.POST, path = "/")
	public ResponseEntity<?> agregar(@RequestBody Producto resource) {
		Producto producto = productoRepo.save(resource);
		return new ResponseEntity<Producto>(producto, HttpStatus.CREATED);

	}
	@RequestMapping(method = RequestMethod.PUT, path = "/{codigo}")
	public ResponseEntity<?> actualizar(@PathVariable("codigo") int codigo, @RequestBody Producto resource) {
		Producto productoEncontrado = productoRepo.findByCodigo(codigo);
		if (productoEncontrado!=null) {
			resource.setCodigo(codigo);
			Producto productoActualizado=productoRepo.save(resource);
			return new ResponseEntity<Producto>(productoActualizado, HttpStatus.OK);
		} else {
			return new ResponseEntity<Producto>( HttpStatus.NOT_FOUND);
		}
		
	}
	
	@RequestMapping(method = RequestMethod.DELETE, path = "/{codigo}")
	public ResponseEntity<?> delete(@PathVariable("codigo") int codigo) {
		Producto productoEncontrado = productoRepo.findByCodigo(codigo);
		if (productoEncontrado != null) {
			productoRepo.delete(productoEncontrado);
			return new ResponseEntity<Producto>(HttpStatus.OK);
		}
		return new ResponseEntity<Producto>(HttpStatus.NOT_FOUND);

	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/buscarPorNombre/{nombre}")
	public ResponseEntity<?> buscarByNombre(@PathVariable("nombre") String nombre) {
		List<Producto> listaProductos = productoRepo.findByNombreLikeIgnoreCase("%" + nombre + "%");
		if (listaProductos == null) {
			return new ResponseEntity<Producto>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Producto>>(listaProductos, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/buscarPorCodigo/{codigo}")
	public ResponseEntity<?> bucarByDui(@PathVariable("codigo") int codigo) {
		Producto productoEncontrado= productoRepo.findByCodigo(codigo);
		if (productoEncontrado !=null) {
			return new ResponseEntity<Producto>(productoEncontrado, HttpStatus.OK);

		}
		return new ResponseEntity<Producto>(HttpStatus.NOT_FOUND);

	}

}
