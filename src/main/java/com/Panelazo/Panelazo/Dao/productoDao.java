package com.Panelazo.Panelazo.Dao;

import java.util.List;

import com.Panelazo.Panelazo.Modelo.productos;
import com.Panelazo.Panelazo.Modelo.provedor;


public interface productoDao {

	List<productos> producto();
	public void saveproducto(productos producto);
	productos getproducto(Integer id);
	public void actualizarproducto(productos producto);
	public void delproducto(Integer id);
}
