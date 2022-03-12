package com.Panelazo.Panelazo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Panelazo.Panelazo.Modelo.productos;
import com.Panelazo.Panelazo.Modelo.user;
import com.Panelazo.Panelazo.Dao.productoDao;
import com.Panelazo.Panelazo.Dao.usuarioDao;
import com.Panelazo.Panelazo.Modelo.usuario;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class productoController {
	@Autowired
	private productoDao productodao;
	
	@RequestMapping(value = "getproducto", method = RequestMethod.GET)
	public List<productos> producto() {
		return productodao.producto();
	}
		
	@PostMapping("/registrarproducto")
	public String registrarproducto(@RequestBody productos producto) {
		
		productodao.saveproducto(producto);
		return "Registrado con exito";
	}
	
	@RequestMapping(value = "update/{id}", method = RequestMethod.GET)
	public productos getproducto(@PathVariable Integer id) {
		return productodao.getproducto(id);
	}
	
	
	@PutMapping("/updateProducto")
	public String updateProducto(@RequestBody productos producto) {
		
		productodao.actualizarproducto(producto);
		return "Actualizado con exito";
	}
	
	@DeleteMapping("/delProducto/{id}")
	public String deleteProducto(@PathVariable Integer id) {
		
		productodao.delproducto(id);
		return "Eliminado con exito";
	}

}


