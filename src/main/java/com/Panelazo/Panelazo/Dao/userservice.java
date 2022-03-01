package com.Panelazo.Panelazo.Dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.Panelazo.Panelazo.Modelo.usuario;

public interface userservice extends CrudRepository<usuario, Long> {
//registrar usuario
	

}
