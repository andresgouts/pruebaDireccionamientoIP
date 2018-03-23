package com.pruebaip.dominio;

import java.util.List;

import com.prueba.dto.UsuarioDTO;
import com.pruebaip.services.UsuarioService;

public class UsuarioDominio {
	
	private UsuarioService usuarioService;

	public UsuarioDominio(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	public List<UsuarioDTO> getUsuarios(){
		return this.usuarioService.getAllUsuarios();
	}
	
	public UsuarioDTO getUsuarioById(Long idUsuario) {
		return this.usuarioService.getUsuarioByIdUsuario(idUsuario);
	}
	
	public UsuarioDTO crearUsuario(UsuarioDTO usuario) {
		return this.usuarioService.crearUsuario(usuario);
	}
	

}
