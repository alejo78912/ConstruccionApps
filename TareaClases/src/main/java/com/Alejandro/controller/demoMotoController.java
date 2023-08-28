package com.Alejandro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Alejandro.models.Moto;
import com.Alejandro.repository.IMotoRepository;


@Controller
@RequestMapping("/moto")
public class demoMotoController {

	
	
	 @Autowired
	    private IMotoRepository motoRepository;

	    @GetMapping("/motos")
	    public String listMotos(Model model) {
	        // Obtener todos los usuarios de la base de datos
	        List<Moto> motos = motoRepository.findAll();

	        model.addAttribute("motos", motos);
	        return "moto-list"; // Retorna el nombre del archivo HTML en src/main/resources/templates
	    }

}

