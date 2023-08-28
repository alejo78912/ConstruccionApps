package com.Alejandro.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Moto {

	@Id
  	private String placa;
	
	private int cilindraje;
	private String modelo;
	private String referencia;
	
	
	
	
	public Moto(String placa, int cilindraje, String modelo, String referencia) {
		super();
		this.placa = placa;
		this.cilindraje = cilindraje;
		this.modelo = modelo;
		this.referencia = referencia;
	}
	public Moto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getCilindraje() {
		return cilindraje;
	}
	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	
	
}
