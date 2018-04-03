package com.pruebaip.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.dto.PerfilDTO;
import com.pruebaip.dominio.PerfilDominio;
import com.pruebaip.services.PerfilService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "http://127.0.0.1:8080"})
@RequestMapping("/perfil")
public class PerfilControlador {
	
	@Autowired
	PerfilService perfilService;
	
	@GetMapping("/perfiles")
	public List<PerfilDTO> getPerfiles() {
		PerfilDominio perfilDominio = new PerfilDominio(perfilService);
		return perfilDominio.getPerfiles();
	}
	
}
