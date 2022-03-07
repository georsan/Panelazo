package com.Panelazo.Panelazo.Dao;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.Panelazo.Panelazo.Modelo.orden;
import com.Panelazo.Panelazo.Modelo.usuario;
@Repository
@Transactional
public class ordenDaoImplementacion implements ordenDao{
	 @PersistenceContext
	    EntityManager entityManager;

	@Override
    public List<orden>orden() {
    	String query = "FROM orden";
        return entityManager.createQuery(query).getResultList(); 
    }
	
    @Override
	public void saveorden(orden orden) {
		// TODO Auto-generated method stub
		entityManager.merge(orden);
	}
    //@Override
	//public usuario getuser(usuario user){
		//String query="From usuario where email=:email";
		//List<usuario>lista=entityManager.createQuery(query).setParameter("email", user.getEmail()).getResultList();
		
		//if(lista.isEmpty()) {
			//return null;
		//}
		//return lista.get(0);
    //}


    

}
