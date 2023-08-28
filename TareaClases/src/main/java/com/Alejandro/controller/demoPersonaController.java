package com.Alejandro.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Alejandro.models.Persona;
import com.Alejandro.repository.IPersonaRepository;


@Controller
@RequestMapping("/persona")
public class demoPersonaController {
	

    @Autowired
    private IPersonaRepository PersonaRepository;

    @GetMapping("/personas")
    public String listPersonas(Model model) {
        // Obtener todos los usuarios de la base de datos
        List<Persona> personas = PersonaRepository.findAll();

        model.addAttribute("personas", personas);
        return "persona-list"; // Retorna el nombre del archivo HTML en src/main/resources/templates
    }
    

   
}
