package com.pruebaip.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Sede")
public class SedeEntity implements Serializable {
	
	private static final long serialVersionUID = 6654609945385360229L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSede;
	
	@Column(nullable = false, length = 60)
	private String nombreSede;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCiudad")
	private CiudadEntity ciudad;
	
	public Long getIdSede() {
		return idSede;
	}
	public void setIdSede(Long idSede) {
		this.idSede = idSede;
	}
	public String getNombreSede() {
		return nombreSede;
	}
	public void setNombreSede(String nombreSede) {
		this.nombreSede = nombreSede;
	}
	public CiudadEntity getCiudad() {
		return ciudad;
	}
	public void setCiudad(CiudadEntity ciudad) {
		this.ciudad = ciudad;
	}
	
}
