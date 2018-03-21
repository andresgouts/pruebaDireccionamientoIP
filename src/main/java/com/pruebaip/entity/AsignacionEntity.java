package com.pruebaip.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

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
@Table(name="Asignacion")
public class AsignacionEntity implements Serializable {

	private static final long serialVersionUID = -2249781009058224308L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAsignacion;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="idTipoAsignacion")
	private TipoAsignacionEntity tipoAsignacion;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="idListaItemUrl")
	private ListaItemEntity nombreURL;
	
	@JoinColumn(name="idListaItemServidor")
	private ListaItemEntity nombreServidor;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="idListaItemServicioIT")
	private ListaItemEntity servicioITNegocio;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="idListaItemPlataforma")
	private ListaItemEntity plataforma;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="idListaItemFuncion")
	private ListaItemEntity funcion;
	
	@Column(length = 300)
	private String observaciones;
	
	@ManyToOne(fetch= FetchType.LAZY)
	private DireccionIpEntity direccionIp;
	
	private LocalDateTime fechaCreacion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idUsarioCrea")
	private UsuarioEntity usuarioCrea;
	
	
	private LocalDateTime fechaInactiva;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idUsarioInactiva")
	private UsuarioEntity usuarioInactiva;
	
	private String configuracionDNS;
	
	
	public Long getIdAsignacion() {
		return idAsignacion;
	}
	public void setIdAsignacion(Long idAsignacion) {
		this.idAsignacion = idAsignacion;
	}
	public TipoAsignacionEntity getTipoAsignacion() {
		return tipoAsignacion;
	}
	public void setTipoAsignacion(TipoAsignacionEntity tipoAsignacion) {
		this.tipoAsignacion = tipoAsignacion;
	}
	public ListaItemEntity getNombreURL() {
		return nombreURL;
	}
	public void setNombreURL(ListaItemEntity nombreURL) {
		this.nombreURL = nombreURL;
	}
	public ListaItemEntity getNombreServidor() {
		return nombreServidor;
	}
	public void setNombreServidor(ListaItemEntity nombreServidor) {
		this.nombreServidor = nombreServidor;
	}
	public ListaItemEntity getServicioITNegocio() {
		return servicioITNegocio;
	}
	public void setServicioITNegocio(ListaItemEntity servicioITNegocio) {
		this.servicioITNegocio = servicioITNegocio;
	}
	public ListaItemEntity getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(ListaItemEntity plataforma) {
		this.plataforma = plataforma;
	}
	public ListaItemEntity getFuncion() {
		return funcion;
	}
	public void setFuncion(ListaItemEntity funcion) {
		this.funcion = funcion;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public DireccionIpEntity getDireccionIp() {
		return direccionIp;
	}
	public void setDireccionIp(DireccionIpEntity direccionIp) {
		this.direccionIp = direccionIp;
	}
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public UsuarioEntity getUsuarioCrea() {
		return usuarioCrea;
	}
	public void setUsuarioCrea(UsuarioEntity usuarioCrea) {
		this.usuarioCrea = usuarioCrea;
	}
	public LocalDateTime getFechaInactiva() {
		return fechaInactiva;
	}
	public void setFechaInactiva(LocalDateTime fechaInactiva) {
		this.fechaInactiva = fechaInactiva;
	}
	public UsuarioEntity getUsuarioInactiva() {
		return usuarioInactiva;
	}
	public void setUsuarioInactiva(UsuarioEntity usuarioInactiva) {
		this.usuarioInactiva = usuarioInactiva;
	}
	public String getConfiguracionDNS() {
		return configuracionDNS;
	}
	public void setConfiguracionDNS(String configuracionDNS) {
		this.configuracionDNS = configuracionDNS;
	}
	

}
