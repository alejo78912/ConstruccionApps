package com.Alejandro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Alejandro.models.Carro;

public interface ICarroRepository extends JpaRepository<Carro, String>{

}
