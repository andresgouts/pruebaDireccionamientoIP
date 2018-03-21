package com.pruebaip.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PermisoPerfil")
public class PermisosPerfilEntity implements Serializable {


	private static final long serialVersionUID = -5467674797533632441L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPermisoPerfil;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private PerfilEntity perfil;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private PermisoEntity permiso;
	
	public PermisosPerfilEntity() {
		//Constructor
	}
	
	//Getters&Setters	
	public Long getIdPermisoPerfil() {
		return idPermisoPerfil;
	}
	public void setIdPermisoPerfil(Long idPermisoPerfil) {
		this.idPermisoPerfil = idPermisoPerfil;
	}
	public PerfilEntity getPerfil() {
		return perfil;
	}
	public void setPerfil(PerfilEntity perfil) {
		this.perfil = perfil;
	}
	public PermisoEntity getPermiso() {
		return permiso;
	}
	public void setPermiso(PermisoEntity permiso) {
		this.permiso = permiso;
	}
	
}
