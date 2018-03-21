package com.prueba.dto;

public class DireccionIpDTO {
	
	private Long idDireccionIp;
	private String direccionIp;	
	
	public DireccionIpDTO() {
		//Constructor vacio
	}	
	
	//Getters y Setters
	public Long getIdDireccionIp() {
		return idDireccionIp;
	}
	public void setIdDireccionIp(Long idDireccionIp) {
		this.idDireccionIp = idDireccionIp;
	}
	public String getDireccionIp() {
		return direccionIp;
	}
	public void setDireccionIp(String direccionIp) {
		this.direccionIp = direccionIp;
	}
}
