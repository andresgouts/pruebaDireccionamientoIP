package com.pruebaip.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ListaItem",
indexes = {@Index(columnList="codigoItem, LISTA_ID_LISTA", unique = true)})
public class ListaItemEntity implements Serializable{

	private static final long serialVersionUID = -3095320183849713182L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idListaItem;
	@Column(length=8)
	private String codigoItem;
	@Column(length=300)
	private String descripcionItem;
	@Column(length=300)
	private String valorItem;
	
	private Boolean indicadorHabilitado;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private ListaEntity lista;
	
	
	public Long getIdListaItem() {
		return idListaItem;
	}
	public void setIdListaItem(Long idListaItem) {
		this.idListaItem = idListaItem;
	}
	public String getCodigoItem() {
		return codigoItem;
	}
	public void setCodigoItem(String codigoItem) {
		this.codigoItem = codigoItem;
	}
	public String getDescripcionItem() {
		return descripcionItem;
	}
	public void setDescripcionItem(String descripcionItem) {
		this.descripcionItem = descripcionItem;
	}
	public String getValorItem() {
		return valorItem;
	}
	public void setValorItem(String valorItem) {
		this.valorItem = valorItem;
	}
	public Boolean getIndicadorHabilitado() {
		return indicadorHabilitado;
	}
	public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
		this.indicadorHabilitado = indicadorHabilitado;
	}
		
}
