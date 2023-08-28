package com.Alejandro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.Alejandro.models.Electrodomestico;
import com.Alejandro.repository.IElectrodomesticoRepository;


@Controller
@RequestMapping("/Electrodomestico")
public class demoElectrodomesticoController {

	

	 @Autowired
	    private IElectrodomesticoRepository electrodomesticoRepository;

	    @GetMapping("/Electrodomestico")
	    public String listElectrodomesticos(Model model) {
	        // Obtener todos los usuarios de la base de datos
	        List<Electrodomestico> electrodomesticos = electrodomesticoRepository.findAll();

	        model.addAttribute("electrodomesticos", electrodomesticos);
	        return "electrodomestico-list"; // Retorna el nombre del archivo HTML en src/main/resources/templates
	    }
}
