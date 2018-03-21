package com.pruebaip.entity;

import java.io.Serializable;
import java.sql.Timestamp;

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
@Table(name="Vlan")
public class VlanEntity implements Serializable {

	private static final long serialVersionUID = 3282711511355261559L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVlan;
	
	@Column(nullable = false, length = 250)
	private String nombreVlan;
	
	private Integer tamano;
	
	private Timestamp fechaCreada;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name= "idUsuarioCrea")
	private UsuarioEntity usuarioCrea;
	
	private Timestamp fechaInactiva;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name= "idUsuarioInactiva")
	private UsuarioEntity usuarioInactiva;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idSedeCompania")
	private SedeCompaniaEntity sedeCompania;
		
	
	public Long getIdVlan() {
		return idVlan;
	}
	public void setIdVlan(Long idVlan) {
		this.idVlan = idVlan;
	}
	public String getNombreVlan() {
		return nombreVlan;
	}
	public void setNombreVlan(String nombreVlan) {
		this.nombreVlan = nombreVlan;
	}
	public Integer getTamano() {
		return tamano;
	}
	public void setTamano(Integer tamano) {
		this.tamano = tamano;
	}
	public Timestamp getFechaCreada() {
		return fechaCreada;
	}
	public void setFechaCreada(Timestamp fechaCreada) {
		this.fechaCreada = fechaCreada;
	}
	public UsuarioEntity getUsuarioCrea() {
		return usuarioCrea;
	}
	public void setUsuarioCrea(UsuarioEntity usuarioCrea) {
		this.usuarioCrea = usuarioCrea;
	}
	public Timestamp getFechaInactiva() {
		return fechaInactiva;
	}
	public void setFechaInactiva(Timestamp fechaInactiva) {
		this.fechaInactiva = fechaInactiva;
	}
	public UsuarioEntity getUsuarioInactiva() {
		return usuarioInactiva;
	}
	public void setUsuarioInactiva(UsuarioEntity usuarioInactiva) {
		this.usuarioInactiva = usuarioInactiva;
	}
	public SedeCompaniaEntity getSedeCompania() {
		return sedeCompania;
	}
	public void setSedeCompania(SedeCompaniaEntity sedeCompania) {
		this.sedeCompania = sedeCompania;
	}
	

}
