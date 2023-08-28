package com.Alejandro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Alejandro.models.Persona;



public interface IPersonaRepository extends JpaRepository<Persona, Long>{

}
