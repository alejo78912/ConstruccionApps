package com.Alejandro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Alejandro.models.Animal;
import com.Alejandro.repository.IAnimalRepository;


@Controller
@RequestMapping("/animal")
public class demoAnimalController {

	
	
	 @Autowired
	 private IAnimalRepository AnimalRepository;

	    @GetMapping("/animales")
	    public String listAnimales(Model model) {
	        // Obtener todos los usuarios de la base de datos
	        List<Animal> animales = AnimalRepository.findAll();

	        model.addAttribute("animales", animales);
	        return "animal-list"; // Retorna el nombre del archivo HTML en src/main/resources/templates
	    }

}
