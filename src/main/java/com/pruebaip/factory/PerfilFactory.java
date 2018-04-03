package com.pruebaip.factory;

import com.prueba.dto.PerfilDTO;
import com.pruebaip.entity.PerfilEntity;

public class PerfilFactory {
	
	private PerfilFactory() {
		throw new IllegalStateException("PefilFactory class");
	}
	
	public static PerfilDTO convertirDTO(PerfilEntity perfil) {
		return new PerfilDTO(perfil.getIdPerfil(), perfil.getCodigoPerfil(), perfil.getDescripcionPerfil());
	}
	
	public static PerfilEntity convertirEntity(PerfilDTO perfil) {
		PerfilEntity perfilEntity = new PerfilEntity();
		perfilEntity.setCodigoPerfil(perfil.getCodigoPerfil());
		perfilEntity.setDescripcionPerfil(perfil.getDescripcionPerfil());
		perfilEntity.setIdPerfil(perfil.getIdPerfil());
		return perfilEntity;
	}
}
