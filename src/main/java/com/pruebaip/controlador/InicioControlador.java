package com.pruebaip.controlador;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.prueba.dto.InformacionInicioDTO;
import com.pruebaip.repositorio.DireccionIpRepositorio;
import com.pruebaip.repositorio.SedeCompaniaRepositorio;
import com.pruebaip.services.InicioServices;

@RestController
@RequestMapping("/inicio")
public class InicioControlador {
	
	@Autowired
	DireccionIpRepositorio direccionIpRepositorio;
	@Autowired
	SedeCompaniaRepositorio sedeCompaniaRepositorio;
	
	@GetMapping("/ip")
	public InformacionInicioDTO consultarInformacionInicio() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
		InicioServices inicioServices = new InicioServices(direccionIpRepositorio, sedeCompaniaRepositorio);
		return inicioServices.obtenerInformacionPorIp(request.getRemoteAddr());		
	}
	
}
