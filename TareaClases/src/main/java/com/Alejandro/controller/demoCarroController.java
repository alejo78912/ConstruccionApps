package com.Alejandro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.Alejandro.models.Carro;
import com.Alejandro.repository.ICarroRepository;




@Controller
@RequestMapping("/carro")
public class demoCarroController {

	

	 @Autowired
	    private ICarroRepository carroRepository;

	    @GetMapping("/carros")
	    public String listCarros(Model model) {
	        // Obtener todos los usuarios de la base de datos
	        List<Carro> carros = carroRepository.findAll();

	        model.addAttribute("carros", carros);
	        return "carro-list"; // Retorna el nombre del archivo HTML en src/main/resources/templates
	    }
}
