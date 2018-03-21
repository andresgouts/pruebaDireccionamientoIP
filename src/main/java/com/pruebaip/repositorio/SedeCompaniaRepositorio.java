package com.pruebaip.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pruebaip.entity.SedeCompaniaEntity;

public interface SedeCompaniaRepositorio extends JpaRepository<SedeCompaniaEntity, Long> {
	
	/**
	 * Devuelve la sedeCompania de una Vlan segun el idVlan
	 * @param id
	 * @return
	 */
	@Query(value = "select v.sedeCompania from VlanEntity v inner join v.sedeCompania where v.idVlan = :id")
	SedeCompaniaEntity sedeCompaniaByIdVlan(@Param("id") Long id);
}
