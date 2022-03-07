package com.Panelazo.Panelazo.Modelo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
@Entity
@Table(name = "productos")
public class productos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_productos;
	@Column(name="nombre",length = 60)
	private String nombre;
	@Column(name="descripcion",length = 2000)
	private String descripcion;
	@Column(name="precio",length = 100)
	private String precio;
	@Column(name="unidad_de_medida",length = 200)
	private String unidad_de_medida;
	@Column(name="linea_productos",length = 255)
	private String linea_productos;
    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })	
    @JoinTable(
            name = "detalleorden",
            joinColumns = {@JoinColumn(name = "id_productos")},
            inverseJoinColumns = {@JoinColumn(name = "id_orden")}
    )
    private Set<orden> orden;
	
    @ManyToMany(mappedBy = "productos")
    private Set<provedor> provedor;
	public Integer getId_productos() {
		return id_productos;
	}
	public void setId_productos(Integer id_productos) {
		this.id_productos = id_productos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getUnidad_de_medida() {
		return unidad_de_medida;
	}
	public void setUnidad_de_medida(String unidad_de_medida) {
		this.unidad_de_medida = unidad_de_medida;
	}
	public String getLinea_productos() {
		return linea_productos;
	}
	public void setLinea_productos(String linea_productos) {
		this.linea_productos = linea_productos;
	}
	
	
}
