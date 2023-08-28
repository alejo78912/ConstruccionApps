package com.Alejandro.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Animal {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long CodAnimal;
	
	private String tipoAnimal;
	
	
	
	
	public Animal(String tipoAnimal, long codAnimal) {
		this.tipoAnimal = tipoAnimal;
		CodAnimal = codAnimal;
	}


	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getTipoAnimal() {
		return tipoAnimal;
	}


	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}


	public long getCodAnimal() {
		return CodAnimal;
	}


	public void setCodAnimal(long codAnimal) {
		CodAnimal = codAnimal;
	}
	
	
	
	
	
}
