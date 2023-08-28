package com.Alejandro.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Carro {

	@Id
	private String placa;
	
	
	private String marca;
	private String modelo;
	private String referencia;
	
	
	
	
	public Carro() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Carro(String marca, String placa, String modelo, String referencia) {
		super();
		this.marca = marca;
		this.placa = placa;
		this.modelo = modelo;
		this.referencia = referencia;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
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
