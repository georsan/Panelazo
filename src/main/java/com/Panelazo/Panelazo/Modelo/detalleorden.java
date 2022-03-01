package com.Panelazo.Panelazo.Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "detalleorden")
public class detalleorden {
	@Id
	private Integer id_detalle_orden;
	@Column(name="id_productos")
	private Integer id_productos;
	@Column(name="id_orden")
	private Integer id_orden;
	@Column(name="cantidad",length = 60)
	private String cantidad;
	@Column(name="total",length = 200)
	private String total;
	
	public Integer getId_detalle_orden() {
		return id_detalle_orden;
	}
	public void setId_detalle_orden(Integer id_detalle_orden) {
		this.id_detalle_orden = id_detalle_orden;
	}
	public Integer getId_productos() {
		return id_productos;
	}
	public void setId_productos(Integer id_productos) {
		this.id_productos = id_productos;
	}
	public Integer getId_orden() {
		return id_orden;
	}
	public void setId_orden(Integer id_orden) {
		this.id_orden = id_orden;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	
}
