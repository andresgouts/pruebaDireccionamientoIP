package com.pruebaip.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Ciudad")
public class CiudadEntity implements Serializable {

	private static final long serialVersionUID = -3609954496786623592L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPerfil;
	
	@Column(nullable = false)
	private String nombreCiudad;

	public Long getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(Long idPerfil) {
		this.idPerfil = idPerfil;
	}

	public String getNombreCiudad() {
		return nombreCiudad;
	}

	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}
	
}
