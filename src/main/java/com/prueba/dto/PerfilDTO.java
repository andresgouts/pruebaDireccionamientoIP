package com.prueba.dto;

import java.io.Serializable;

public class PerfilDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long idPerfil;
	private String codigoPerfil;
	private String descripcionPerfil;
	
	public PerfilDTO(Long idPerfil, String codigoPerfil, String descripcionPerfil) {
		super();
		this.idPerfil = idPerfil;
		this.codigoPerfil = codigoPerfil;
		this.descripcionPerfil = descripcionPerfil;
	}
	
	public Long getIdPerfil() {
		return idPerfil;
	}
	public void setIdPerfil(Long idPerfil) {
		this.idPerfil = idPerfil;
	}
	public String getCodigoPerfil() {
		return codigoPerfil;
	}
	public void setCodigoPerfil(String codigoPerfil) {
		this.codigoPerfil = codigoPerfil;
	}
	public String getDescripcionPerfil() {
		return descripcionPerfil;
	}
	public void setDescripcionPerfil(String descripcionPerfil) {
		this.descripcionPerfil = descripcionPerfil;
	}
	
	
}
