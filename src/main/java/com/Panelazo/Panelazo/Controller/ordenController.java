package com.Panelazo.Panelazo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.Panelazo.Panelazo.Modelo.user;
import com.Panelazo.Panelazo.Dao.ordenDao;
import com.Panelazo.Panelazo.Dao.usuarioDao;
import com.Panelazo.Panelazo.Modelo.usuario;

@RestController
public class ordenController {
	@Autowired
	private ordenDao ordendao;
	@CrossOrigin(origins = "https://panelazo7.herokuapp.com/")
	@RequestMapping(value = "getorden", method = RequestMethod.GET)
	public List<com.Panelazo.Panelazo.Modelo.orden> orden() {
		return ordendao.orden();
	}
		
	@PostMapping("/neworden")
	public String registrarUsuario(@RequestBody com.Panelazo.Panelazo.Modelo.orden orden) {
		
		ordendao.saveorden(orden);
		return "Registrado con exito";
	}
	


}


