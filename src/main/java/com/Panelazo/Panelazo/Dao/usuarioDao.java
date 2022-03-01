package com.Panelazo.Panelazo.Dao;


import java.util.List;
import com.Panelazo.Panelazo.Modelo.user;
import com.Panelazo.Panelazo.Modelo.usuario;

public interface usuarioDao{
	public 	List<usuario>user();
	public void saveUsuario(usuario user);
	


}
