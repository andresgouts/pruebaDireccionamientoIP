package com.pruebaip.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.prueba.dto.PerfilDTO;
import com.pruebaip.entity.PerfilEntity;
import com.pruebaip.factory.PerfilFactory;
import com.pruebaip.repositorio.PerfilRepository;

@Service
public class PerfilServiceImpl implements PerfilService {
	
	private final PerfilRepository perfilRepository;
	
	public PerfilServiceImpl(PerfilRepository perfilRepository) {
		this.perfilRepository = perfilRepository;
	}

	@Override
	public List<PerfilDTO> findAll() {
		List<PerfilDTO> perfiles = new ArrayList<>();
		List<PerfilEntity> perfilesEntity = perfilRepository.findAll();
		for(PerfilEntity perfil : perfilesEntity) {
			perfiles.add(PerfilFactory.convertirDTO(perfil));
		}
		return perfiles;
	}

	@Override
	public PerfilDTO findByIdPerfil(Long idPerfil) {
		Optional<PerfilEntity> perfilEntity = perfilRepository.findById(idPerfil);
		if(perfilEntity.isPresent()) {
			return PerfilFactory.convertirDTO(perfilEntity.get());
		}
		return null;
	}

}
