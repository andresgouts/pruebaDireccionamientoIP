package com.pruebaip.services;

import java.util.List;
import java.util.Optional;

import com.prueba.dto.UsuarioDTO;
import com.pruebaip.entity.UsuarioEntity;

public interface UsuarioService {
	
	UsuarioDTO getUsuarioByIdUsuario(Long idUsuario);
	
	Optional<UsuarioEntity> getUsuarioByLoginUsuario(String loginUsuario);
	
	List<UsuarioDTO> getAllUsuarios();
	
	UsuarioDTO crearUsuario (UsuarioDTO form);

}
