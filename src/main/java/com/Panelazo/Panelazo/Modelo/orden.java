package com.Panelazo.Panelazo.Modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "orden")
public class orden {
	@Id
	private Integer id_orden;
	@ManyToOne()
	@JoinColumn(name = "id_provedor")
	private provedor provedor;
	@ManyToOne()
	@JoinColumn(name = "id_usuario")
	private usuario user;
	@Column(name="fecha",length = 60)
	private String fecha;
	@Column(name="estado",length = 60)
	private String estado;
	@OneToMany(mappedBy = "orden")
	private List<productos>producto;
	public Integer getId_orden() {
		return id_orden;
	}
	public void setId_orden(Integer id_orden) {
		this.id_orden = id_orden;
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


}
