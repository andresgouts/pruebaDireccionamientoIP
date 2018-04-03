package com.pruebaip.factory;

import com.prueba.dto.PerfilDTO;
import com.prueba.dto.UsuarioDTO;
import com.pruebaip.entity.UsuarioEntity;

public class UsuarioFactory {
	
	private UsuarioFactory() {
		throw new IllegalStateException("UsuarioFactory class");
	}

	public static UsuarioEntity convertirEntity (UsuarioDTO dto) {
		UsuarioEntity usuario = new UsuarioEntity();
		usuario.setCargoUsuario(dto.getCargoUsuario());
		usuario.setEmailUsuario(dto.getEmailUsuario());
		usuario.setIdUsuario(dto.getIdUsuario());
		usuario.setLoginUsuario(dto.getLoginUsuario());
		usuario.setNombreUsuario(dto.getNombreUsuario());
		usuario.setPerfil(PerfilFactory.convertirEntity(dto.getPerfil()));
		return usuario;
	}
	
	public static UsuarioDTO convertirDTO (UsuarioEntity entity) {
		PerfilDTO perfil = new PerfilDTO(entity.getPerfil().getIdPerfil(), entity.getPerfil().getCodigoPerfil(), entity.getPerfil().getDescripcionPerfil());
		return new UsuarioDTO(entity.getIdUsuario(), entity.getLoginUsuario(), entity.getNombreUsuario(), entity.getEmailUsuario(), 
				entity.getCargoUsuario(), perfil);
	}

}
