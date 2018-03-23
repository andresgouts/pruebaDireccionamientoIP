package com.pruebaip.services;

import java.util.List;

import com.prueba.dto.PerfilDTO;

public interface PerfilService {
	
	List<PerfilDTO> findAll();
	
	PerfilDTO findByIdPerfil(Long idPerfil);
}
