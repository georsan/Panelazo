package com.Panelazo.Panelazo.Dao;


import java.util.List;
import com.Panelazo.Panelazo.Modelo.user;
import com.Panelazo.Panelazo.Modelo.usuario;

public interface ordenDao{
	public 	List<com.Panelazo.Panelazo.Modelo.orden>orden();
	public void saveorden(com.Panelazo.Panelazo.Modelo.orden orden);
	//usuario getuser(usuario user);


}
