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
@Table(name="Permiso")
public class PermisoEntity implements Serializable {
	
	
	private static final long serialVersionUID = -4156898706648196330L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPermiso;
	
	@Column(length=6, nullable = false)
	private String codigoPerimiso;
	
	@Column(length=300, nullable = false)
	private String descripcion;
	
	@OneToMany(fetch= FetchType.LAZY, cascade= CascadeType.ALL, mappedBy= "permiso")
	private List<PermisosPerfilEntity> perfiles;
		
	//Constructor
	public PermisoEntity() {
		this.perfiles = new ArrayList<>();
	}
	
	//Getters&Setters
	public Long getIdPermiso() {
		return idPermiso;
	}
	public void setIdPermiso(Long idPermiso) {
		this.idPermiso = idPermiso;
	}
	public String getCodigoPerimiso() {
		return codigoPerimiso;
	}
	public void setCodigoPerimiso(String codigoPerimiso) {
		this.codigoPerimiso = codigoPerimiso;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public List<PermisosPerfilEntity> getPerfiles() {
		return perfiles;
	}
	public void setPerfiles(List<PermisosPerfilEntity> perfiles) {
		this.perfiles = perfiles;
	}	
	
}
