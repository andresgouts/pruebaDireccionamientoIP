package com.pruebaip.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Compania")
public class CompaniaEntity implements Serializable {

	private static final long serialVersionUID = -4449509733771708436L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCompania;
	
	@Column(nullable = false, length = 60)
	private String nombreCompania;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "compania")
	private List<SedeCompaniaEntity> sedesCompania;
	
	
	//Constructor
	public CompaniaEntity() {
		this.sedesCompania = new ArrayList<>();
	}


	//Getters&Setters
	public Long getIdCompania() {
		return idCompania;
	}


	public void setIdCompania(Long idCompania) {
		this.idCompania = idCompania;
	}


	public String getNombreCompania() {
		return nombreCompania;
	}


	public void setNombreCompania(String nombreCompania) {
		this.nombreCompania = nombreCompania;
	}


	public List<SedeCompaniaEntity> getSedesCompania() {
		return sedesCompania;
	}


	public void setSedesCompania(List<SedeCompaniaEntity> sedesCompania) {
		this.sedesCompania = sedesCompania;
	}
	
	
	
}
