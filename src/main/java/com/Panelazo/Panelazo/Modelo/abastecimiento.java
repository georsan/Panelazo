package com.Panelazo.Panelazo.Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "abastecimiento")
public class abastecimiento {
@Id
private Integer id_abs;
@Column(name="id_provedor")
private Integer id_provedor;
@Column(name="id_productos")
private Integer id_productos;

public Integer getId_abs() {
	return id_abs;
}
public void setId_abs(Integer id_abs) {
	this.id_abs = id_abs;
}
public Integer getId_provedor() {
	return id_provedor;
}
public void setId_provedor(Integer id_provedor) {
	this.id_provedor = id_provedor;
}
public Integer getId_productos() {
	return id_productos;
}
public void setId_productos(Integer id_productos) {
	this.id_productos = id_productos;
}

}
