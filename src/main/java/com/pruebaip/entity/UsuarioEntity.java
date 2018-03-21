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
@Table(name="Usuario")
public class UsuarioEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;
	
	@Column(nullable= false)
	private String loginUsuario;
	
	@Column(nullable= false)
	private String nombreUsuario;
	
	private String emailUsuario;
	
	private String cargoUsuario;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idPerfil")
	private PerfilEntity perfil;
	
	public UsuarioEntity() {
		// Constructor 
	}
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getLoginUsuario() {
		return loginUsuario;
	}
	public void setLoginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getEmailUsuario() {
		return emailUsuario;
	}
	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}
	public String getCargoUsuario() {
		return cargoUsuario;
	}
	public void setCargoUsuario(String cargoUsuario) {
		this.cargoUsuario = cargoUsuario;
	}
	public PerfilEntity getPerfil() {
		return perfil;
	}
	public void setPerfil(PerfilEntity perfil) {
		this.perfil = perfil;
	}
	
}
