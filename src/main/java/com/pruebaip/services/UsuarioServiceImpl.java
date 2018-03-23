package com.pruebaip.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.prueba.dto.UsuarioDTO;
import com.pruebaip.entity.UsuarioEntity;
import com.pruebaip.factory.UsuarioFactory;
import com.pruebaip.repositorio.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	private final UsuarioRepository usuarioRepository;
	
	public UsuarioServiceImpl(com.pruebaip.repositorio.UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	@Override
	public UsuarioDTO getUsuarioByIdUsuario(Long idUsuario) {
		Optional<UsuarioEntity> usuarioEntity = usuarioRepository.findById(idUsuario);
		if (usuarioEntity.isPresent()) {
			return UsuarioFactory.convertirDTO(usuarioEntity.get());
		}
		return null;
	}

	@Override
	public Optional<UsuarioEntity> getUsuarioByLoginUsuario(String loginUsuario) {
		return usuarioRepository.findByLoginUsuario(loginUsuario);
	}

	@Override
	public List<UsuarioDTO> getAllUsuarios() {
		List<UsuarioDTO> usuariosDTO = new ArrayList<>();
		List<UsuarioEntity> usuariosEntity =  usuarioRepository.findAll();
		for (UsuarioEntity usuario : usuariosEntity) {
			usuariosDTO.add(UsuarioFactory.convertirDTO(usuario));
		}
		return usuariosDTO;
	}

	@Override
	public UsuarioDTO crearUsuario(UsuarioDTO usuarioDTO) {
		UsuarioEntity usuario = UsuarioFactory.convertirEntity(usuarioDTO);
		UsuarioEntity usuarioGuardado = usuarioRepository.save(usuario);
		return UsuarioFactory.convertirDTO(usuarioGuardado);
	}	

}
