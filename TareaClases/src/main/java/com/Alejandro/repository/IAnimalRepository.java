package com.Alejandro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Alejandro.models.Animal;



public interface IAnimalRepository extends JpaRepository<Animal, Long>{

}
