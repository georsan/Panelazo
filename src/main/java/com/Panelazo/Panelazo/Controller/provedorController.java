package com.Panelazo.Panelazo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Panelazo.Panelazo.Dao.provedorDao;
import com.Panelazo.Panelazo.Dao.usuarioDao;
import com.Panelazo.Panelazo.Modelo.provedor;

@RestController
public class provedorController {
	@Autowired
	private provedorDao provedordao;
	@GetMapping("/provedorget")
	public List<provedor> provedor() {
		return provedordao.provedor();
	}
		
	@PostMapping("/registrarProvedor")
	public String registrarUsuario(@RequestBody provedor provedor) {
		
		provedordao.saveprovedor(provedor);
		return "Registrado con exito";
	}
}
