package com.pruebaip.factory;

import com.prueba.dto.PerfilDTO;
import com.pruebaip.entity.PerfilEntity;

public class PerfilFactory {
	
	public static PerfilDTO convertirDTO(PerfilEntity perfil) {
		return new PerfilDTO(perfil.getIdPerfil(), perfil.getCodigoPerfil(), perfil.getDescripcionPerfil());
	}
}
