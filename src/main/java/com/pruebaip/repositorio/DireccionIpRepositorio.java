package com.pruebaip.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebaip.entity.DireccionIpEntity;

public interface DireccionIpRepositorio extends JpaRepository<DireccionIpEntity, Long> {
	
	public List<DireccionIpEntity> findAll();
	
	public DireccionIpEntity findByDireccion(String direccion);

}
