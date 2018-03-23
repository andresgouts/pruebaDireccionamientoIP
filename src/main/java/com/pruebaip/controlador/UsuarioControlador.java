package com.pruebaip.controlador;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.dto.PerfilDTO;
import com.prueba.dto.UsuarioDTO;
import com.pruebaip.dominio.PerfilDominio;
import com.pruebaip.dominio.UsuarioDominio;
import com.pruebaip.services.PerfilService;
import com.pruebaip.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioControlador {
	
	@Autowired
	PerfilService perfilService;
	
	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping("/perfiles")
	public List<PerfilDTO> getPerfiles() {
		PerfilDominio perfilDominio = new PerfilDominio(perfilService);
		return perfilDominio.getPerfiles();
	}
	
	@GetMapping("/usuarios")
	public List<UsuarioDTO> getUsuairos() {
		UsuarioDominio usuarioDominio = new UsuarioDominio(usuarioService);
		return usuarioDominio.getUsuarios();
	}
	
	@GetMapping("/usuarios/{idUsuario}")
	public UsuarioDTO getUsuairo(@PathVariable(name = "idUsuario") Long idUsuario) {
		UsuarioDominio usuarioDominio = new UsuarioDominio(usuarioService);
		return usuarioDominio.getUsuarioById(idUsuario);
	}
	
	@PostMapping("/crear")
	public UsuarioDTO crearUsuario(@Valid @RequestBody UsuarioDTO usuario) {
		UsuarioDominio usuarioDominio = new UsuarioDominio(usuarioService);
		return usuarioDominio.crearUsuario(usuario);
	}
	
}
