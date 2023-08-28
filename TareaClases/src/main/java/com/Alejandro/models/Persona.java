package com.Alejandro.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Persona {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long cedula;
	
	private String nombre;
	private String apellido;
	
	
	
	public Persona(String nombre, long cedula, String apellido) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.apellido = apellido;
	}

	
	

	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}




	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public long getCedula() {
		return cedula;
	}


	public void setCedula(long cedula) {
		this.cedula = cedula;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	
	
}
