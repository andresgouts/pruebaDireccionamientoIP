package com.pruebaip.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="DireccionIp")
public class DireccionIpEntity implements Serializable {


	private static final long serialVersionUID = -4041743847309127996L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idDireccionIp;
	
	@Column(nullable = false, length = 15)
	private String direccion;
	
	private Boolean enUso;
	
	@Column(nullable = false, length = 3)
	private Integer primerOcteto;
	
	@Column(nullable = false, length = 3)
	private Integer segundoOcteto;
	
	@Column(nullable = false, length = 3)
	private Integer tercerOcteto;
	
	@Column(nullable = false, length = 3)
	private Integer cuartoOcteto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idVlan")
	private VlanEntity vlan;
	
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="direccionIp")
	private List<AsignacionEntity> asignaciones;
	
	public DireccionIpEntity() {
		//Constructor
	}

	public Long getIdDireccionIp() {
		return idDireccionIp;
	}

	public void setIdDireccionIp(Long idDireccionIp) {
		this.idDireccionIp = idDireccionIp;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Boolean getEnUso() {
		return enUso;
	}

	public void setEnUso(Boolean enUso) {
		this.enUso = enUso;
	}

	public Integer getPrimerOcteto() {
		return primerOcteto;
	}

	public void setPrimerOcteto(Integer primerOcteto) {
		this.primerOcteto = primerOcteto;
	}

	public Integer getSegundoOcteto() {
		return segundoOcteto;
	}

	public void setSegundoOcteto(Integer segundoOcteto) {
		this.segundoOcteto = segundoOcteto;
	}

	public Integer getTercerOcteto() {
		return tercerOcteto;
	}

	public void setTercerOcteto(Integer tercerOcteto) {
		this.tercerOcteto = tercerOcteto;
	}

	public Integer getCuartoOcteto() {
		return cuartoOcteto;
	}

	public void setCuartoOcteto(Integer cuartoOcteto) {
		this.cuartoOcteto = cuartoOcteto;
	}

	public VlanEntity getVlan() {
		return vlan;
	}

	public void setVlan(VlanEntity vlan) {
		this.vlan = vlan;
	}

	public List<AsignacionEntity> getAsignaciones() {
		return asignaciones;
	}

	public void setAsignaciones(List<AsignacionEntity> asignaciones) {
		this.asignaciones = asignaciones;
	}	
	
}
