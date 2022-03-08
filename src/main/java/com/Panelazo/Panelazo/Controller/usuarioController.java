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
import com.Panelazo.Panelazo.Dao.usuarioDao;
import com.Panelazo.Panelazo.Modelo.usuario;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class usuarioController {
	@Autowired
	private usuarioDao usuariodao;
	@RequestMapping(value = "getuser", method = RequestMethod.GET)
	public List<usuario> usuario() {
		return usuariodao.user();
	}

	@PostMapping("/registrarUser")
	public String registrarUsuario(@RequestBody usuario user) {
			
		usuariodao.saveUsuario(user);
		return "Registrado con exito";
	}
	


}


