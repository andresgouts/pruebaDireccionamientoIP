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
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Lista", 
indexes = {@Index(columnList="codigoLista", unique = true)})
public class ListaEntity implements Serializable {

	private static final long serialVersionUID = -3095320183849713182L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLista;
	@Column(nullable= false, length= 6)
	private String codigoLista;
	@Column(length = 250)
	private String descripcionLista;
	private Boolean indHabilitado;
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="lista")
	private List<ListaItemEntity> items;
	
	
	public Long getIdLista() {
		return idLista;
	}
	public void setIdLista(Long idLista) {
		this.idLista = idLista;
	}
	public String getCodigoLista() {
		return codigoLista;
	}
	public void setCodigoLista(String codigoLista) {
		this.codigoLista = codigoLista;
	}
	public String getDescripcionLista() {
		return descripcionLista;
	}
	public void setDescripcionLista(String descripcionLista) {
		this.descripcionLista = descripcionLista;
	}
	public Boolean getIndHabilitado() {
		return indHabilitado;
	}
	public void setIndHabilitado(Boolean indHabilitado) {
		this.indHabilitado = indHabilitado;
	}
	public List<ListaItemEntity> getItems() {
		return items;
	}
	public void setItems(List<ListaItemEntity> items) {
		this.items = items;
	}
	
	
	
	

}
