package com.pruebaip.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SedeCompania")
public class SedeCompaniaEntity implements Serializable {

	private static final long serialVersionUID = -3688979223694836808L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSedeCompania;
	
	@Column(nullable = false, length = 60)
	private String nombreSedeCompania;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private CompaniaEntity compania;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private SedeEntity sede;
	
		
	public SedeCompaniaEntity() {
		//constructor vacio
	}

	public Long getIdSedeCompania() {
		return idSedeCompania;
	}

	public void setIdSedeCompania(Long idSedeCompania) {
		this.idSedeCompania = idSedeCompania;
	}

	public String getNombreSedeCompania() {
		return nombreSedeCompania;
	}

	public void setNombreSedeCompania(String nombreSedeCompania) {
		this.nombreSedeCompania = nombreSedeCompania;
	}

	public CompaniaEntity getCompania() {
		return compania;
	}

	public void setCompania(CompaniaEntity compania) {
		this.compania = compania;
	}

	public SedeEntity getSede() {
		return sede;
	}

	public void setSede(SedeEntity sede) {
		this.sede = sede;
	}
		
}
