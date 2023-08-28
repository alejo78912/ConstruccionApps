package com.Alejandro.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Electrodomestico {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codElectro ;
	
	private String nombreElectrodomestico;
	
	private String tipoElectrodomestico;


	public Electrodomestico(long codElectro, String nombreElectrodomestico, String tipoElectrodomestico) {
		super();
		this.codElectro = codElectro;
		this.nombreElectrodomestico = nombreElectrodomestico;
		this.tipoElectrodomestico = tipoElectrodomestico;
	}

	public Electrodomestico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getCodElectro() {
		return codElectro;
	}

	public void setCodElectro(long codElectro) {
		this.codElectro = codElectro;
	}

	public String getNombreElectrodomestico() {
		return nombreElectrodomestico;
	}

	public void setNombreElectrodomestico(String nombreElectrodomestico) {
		this.nombreElectrodomestico = nombreElectrodomestico;
	}

	public String getTipoElectrodomestico() {
		return tipoElectrodomestico;
	}

	public void setTipoElectrodomestico(String tipoElectrodomestico) {
		this.tipoElectrodomestico = tipoElectrodomestico;
	}
	
	
	

}
