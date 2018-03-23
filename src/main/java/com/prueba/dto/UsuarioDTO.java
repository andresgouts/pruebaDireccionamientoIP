package com.prueba.dto;

import java.io.Serializable;

public class UsuarioDTO implements Serializable {
	

	private static final long serialVersionUID = 1L;
	private Long idUsuario;
	private String loginUsuario;
	private String nombreUsuario;
	private String emailUsuario;
	private String cargoUsuario;
	private PerfilDTO perfil;
	
	public UsuarioDTO(Long idUsuario, String loginUsuario, String nombreUsuario, String emailUsuario,
			String cargoUsuario, PerfilDTO perfil) {
		super();
		this.idUsuario = idUsuario;
		this.loginUsuario = loginUsuario;
		this.nombreUsuario = nombreUsuario;
		this.emailUsuario = emailUsuario;
		this.cargoUsuario = cargoUsuario;
		this.perfil = perfil;
	}
	
	public UsuarioDTO() {
		//Constructor
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
	public PerfilDTO getPerfil() {
		return perfil;
	}
	public void setPerfil(PerfilDTO perfil) {
		this.perfil = perfil;
	}
		
}
