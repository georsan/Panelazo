package com.Panelazo.Panelazo.Modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "orden")
public class orden {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_orden;
	//@ManyToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "id_provedor",referencedColumnName = "id_provedor")
	//private provedor provedor;
	@Column(name="id_provedor")
	private Integer id_provedor;
	//@ManyToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "id_usuario",referencedColumnName = "id_usuario")
	//private usuario user;
	@Column(name="id_usuario")
	private Integer id_usuario;
	
	@Column(name="fecha",length = 60)
	private String fecha;
	@Column(name="estado",length = 60)
	private String estado;
	@Column(name="cantidad")
	private Double cantidad;
	@Column(name="total")
	private Double total;
	public Integer getId_orden() {
		return id_orden;
	}
	public void setId_orden(Integer id_orden) {
		this.id_orden = id_orden;
	}
	public Integer getId_provedor() {
		return id_provedor;
	}
	public void setId_provedor(Integer id_provedor) {
		this.id_provedor = id_provedor;
	}
	public Integer getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Double getCantidad() {
		return cantidad;
	}
	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	

	//@OneToMany(mappedBy = "orden")
	//private List<productos>producto;
	


}
