package com.Panelazo.Panelazo.Dao;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.Panelazo.Panelazo.Modelo.usuario;
@Repository
@Transactional
public class usuarioDaoImplementacion implements usuarioDao{
	 @PersistenceContext
	    EntityManager entityManager;

	@Override
    public List<usuario>user() {
    	String query = "FROM usuario";
        return entityManager.createQuery(query).getResultList(); 
    }
	
    @Override
	public void saveUsuario(usuario usuario) {
		// TODO Auto-generated method stub
		entityManager.merge(usuario);
	}
    @Override
	public String getuser(usuario user){
		String query="From usuario where email=:email";
		List<usuario>lista=entityManager.createQuery(query).setParameter("email", user.getEmail()).getResultList();
		
		if(lista.isEmpty()) {
			return "nor";
		}else {
		if(lista.get(0).getContraseña().equals(user.getContraseña())) {
		return "c";
    }else {return "nc";}
		}

}}
