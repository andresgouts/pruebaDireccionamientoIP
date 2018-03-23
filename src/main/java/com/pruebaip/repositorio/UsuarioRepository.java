package com.pruebaip.repositorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebaip.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
	
	Optional<UsuarioEntity> findByLoginUsuario(String loginUsuario);
	
}
