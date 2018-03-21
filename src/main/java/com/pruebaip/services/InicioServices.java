package com.pruebaip.services;

import com.prueba.dto.InformacionInicioDTO;
import com.pruebaip.entity.DireccionIpEntity;
import com.pruebaip.entity.SedeCompaniaEntity;
import com.pruebaip.repositorio.DireccionIpRepositorio;
import com.pruebaip.repositorio.SedeCompaniaRepositorio;

public class InicioServices {

	DireccionIpRepositorio direccionRepositoirio;
	SedeCompaniaRepositorio sedeCompaniaRepositorio;

	//Constructores
	public InicioServices(DireccionIpRepositorio direccionRepositoirio,
			SedeCompaniaRepositorio sedeCompaniaRepositorio) {
		this.direccionRepositoirio = direccionRepositoirio;
		this.sedeCompaniaRepositorio = sedeCompaniaRepositorio;
	}
		 
	/**
	 * Metodo que consulta la ubicacion de la ip con la que ingresa al sistema
	 * @param direccionIp
	 * @return
	 */
	public InformacionInicioDTO obtenerInformacionPorIp(String direccionIp) {
		InformacionInicioDTO informacionIp = new InformacionInicioDTO();
		DireccionIpEntity direccion = direccionRepositoirio.findByDireccion(direccionIp);
		if(direccion != null) {
			informacionIp.setDireccion(direccion.getDireccion());
			SedeCompaniaEntity sedeCompania = sedeCompaniaRepositorio.sedeCompaniaByIdVlan(direccion.getVlan().getIdVlan());
			informacionIp.setNombreSede(sedeCompania.getSede().getNombreSede());
			informacionIp.setNombreCompania(sedeCompania.getCompania().getNombreCompania());
			informacionIp.setNombreCiudad(sedeCompania.getSede().getCiudad().getNombreCiudad());
		}else {
			informacionIp.setDireccion(direccionIp);
		}
		
		return informacionIp;
	}
	
}
