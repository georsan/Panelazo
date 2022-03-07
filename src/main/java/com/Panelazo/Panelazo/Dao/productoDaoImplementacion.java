package com.Panelazo.Panelazo.Dao;
import java.util.List;

import com.Panelazo.Panelazo.Modelo.productos;
import com.Panelazo.Panelazo.Modelo.provedor;
import com.Panelazo.Panelazo.Modelo.usuario;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;



@Repository
@Transactional
public class productoDaoImplementacion implements productoDao{
	 @PersistenceContext
	    EntityManager entityManager;

	@Override
    public List<productos> producto() {
    	String query = "FROM productos";
        return entityManager.createQuery(query).getResultList(); 
    }
	
    @Override
	public void saveproducto(productos producto) {
		// TODO Auto-generated method stub
		entityManager.merge(producto);
	}

    //@Override
	//public provedor getuser( user){
		//String query="From usuario where email=:email";
		//List<usuario>lista=entityManager.createQuery(query).setParameter("email", user.getEmail()).getResultList();
    @Override
	public productos getproducto(Integer id) {
    	String query="alter table productos where id_productos=:id_productos";
		List<productos>lista=entityManager.createQuery(query).setParameter("id_productos", id).getResultList();
		
		if(lista.isEmpty()) {
			return null;
		}
		return lista.get(0);
	}

	@Override
	public void actualizarproducto(productos producto) {
		// TODO Auto-generated method stub
		javax.persistence.Query query = entityManager.createNativeQuery("update productos set nombre=:nombres,descripcion=:descripcions,precio=:precios,linea_productos=:linea_producto where id_productos=:id_producto");
		query.setParameter("nombres", producto.getNombre());
		query.setParameter("descripcions", producto.getDescripcion());
		query.setParameter("precios", producto.getPrecio());
		query.setParameter("linea_producto", producto.getLinea_productos());
		query.setParameter("id_producto", producto.getId_productos());
		query.executeUpdate();
	}

	@Override
	public void delproducto(Integer id) {
		// TODO Auto-generated method stub
		 productos producto = entityManager.find(productos.class, id);
	        entityManager.remove(producto);
		
	}


		
		//if(lista.isEmpty()) {
			//return null;
		//}
		//return lista;
    //}



    

}
