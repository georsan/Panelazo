package com.Panelazo.Panelazo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Panelazo.Panelazo.Dao.usuarioDao;
import com.Panelazo.Panelazo.Modelo.usuario;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class loginController {
	@Autowired
	private usuarioDao usuariodao;
	//falta arreglar
	@PostMapping("/login")
	public String login(@RequestBody usuario user) {
		
		return usuariodao.getuser(user);
	}

}
