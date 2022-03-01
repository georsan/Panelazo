package com.Panelazo.Panelazo.Modelo;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "provedor")
public class provedor {
	@Id
	private Integer id_provedor;
	@Column(name="nombre",length = 60)
	private String nombre;
	@Column(name="telefono",length = 60)
	private String telefono;
	@Column(name="email",length = 200)
	private String email;
	@Column(name="direccion",length = 200)
	private String direccion;
	@Column(name="contraseña",length = 255)
	private String contraseña;
	@Column(name="rut",length = 200)
	private String rut;
	@OneToMany(mappedBy = "provedor", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<orden>orden;
    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })	
    @JoinTable(
            name = "abastecimiento",
            joinColumns = {@JoinColumn(name = "id_provedor")},
            inverseJoinColumns = {@JoinColumn(name = "id_productos")}
    )
    private Set<productos> productos;
	public Integer getId_provedor() {
		return id_provedor;
	}
	public void setId_provedor(Integer id_provedor) {
		this.id_provedor = id_provedor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	
}
