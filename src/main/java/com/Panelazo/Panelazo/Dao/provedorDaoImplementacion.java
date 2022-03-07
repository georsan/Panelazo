package com.Panelazo.Panelazo.Dao;
import java.util.List;
import com.Panelazo.Panelazo.Modelo.provedor;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Repository
@Transactional
public class provedorDaoImplementacion implements provedorDao{
	 @PersistenceContext
	    EntityManager entityManager;

	@Override
    public List<provedor>provedor() {
    	String query = "FROM provedor";
        return entityManager.createQuery(query).getResultList(); 
    }
	
    @Override
	public void saveprovedor(provedor provedor) {
		// TODO Auto-generated method stub
		entityManager.merge(provedor);
	}
    //@Override
	//public provedor getuser( user){
		//String query="From usuario where email=:email";
		//List<usuario>lista=entityManager.createQuery(query).setParameter("email", user.getEmail()).getResultList();
		
		//if(lista.isEmpty()) {
			//return null;
		//}
		//return lista;
    //}



    

}
