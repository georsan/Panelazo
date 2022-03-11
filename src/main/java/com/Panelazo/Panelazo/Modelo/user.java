package com.Panelazo.Panelazo.Modelo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class user {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_usuario;
	@Column(name="nombre",length = 60)
	private String nombre;
	@Column(name="apellido",length = 60)
	private String apellido;
	@Column(name="telefono",length = 60)
	private String telefono;
	@Column(name="email",length = 200)
	private String email;
	@Column(name="direccion",length = 200)
	private String direccion;
	@Column(name="contraseña",length = 255)
	private String contraseña;
}