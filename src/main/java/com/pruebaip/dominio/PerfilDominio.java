package com.pruebaip.dominio;

import java.util.List;

import com.prueba.dto.PerfilDTO;
import com.pruebaip.services.PerfilService;

public class PerfilDominio {
	
	private PerfilService perfilService;
	
	public PerfilDominio(PerfilService perfilService) {
		super();
		this.perfilService = perfilService;
	}

	public List<PerfilDTO> getPerfiles(){
		return perfilService.findAll();
	}
}
