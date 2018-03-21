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
@Table(name="Perfil")
public class PerfilEntity implements Serializable {


	private static final long serialVersionUID = -3577170016588049726L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPerfil;
	
	@Column(length=6, nullable= false)
	private String codigoPerfil;
	
	@Column(length=255, nullable= false)
	private String descripcionPerfil;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "perfil")
	private List<PermisosPerfilEntity> permisos;
	
	//Constructor
	public PerfilEntity() {
		this.permisos = new ArrayList<>();
	}
	
	//Getters&Setters
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
	public List<PermisosPerfilEntity> getPermisos() {
		return permisos;
	}
	public void setPermisos(List<PermisosPerfilEntity> permisos) {
		this.permisos = permisos;
	}
	
}
