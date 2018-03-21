package com.pruebaip.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipoAsignacion")
public class TipoAsignacionEntity implements Serializable {

	private static final long serialVersionUID = -8035919676519332757L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTipoAsignacion;
	
	@Column(nullable=false, length=60)
	private String nombreTipoAsignacion;
	
	private String descripcion;
	
	
	public Long getIdTipoAsignacion() {
		return idTipoAsignacion;
	}
	public void setIdTipoAsignacion(Long idTipoAsignacion) {
		this.idTipoAsignacion = idTipoAsignacion;
	}
	public String getNombreTipoAsignacion() {
		return nombreTipoAsignacion;
	}
	public void setNombreTipoAsignacion(String nombreTipoAsignacion) {
		this.nombreTipoAsignacion = nombreTipoAsignacion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
