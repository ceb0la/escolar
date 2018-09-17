package br.gov.ba.pm.escolar.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AnoLetivo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id;
	
	@Column
	private Calendar ano;
	
	@Column 
	private String observacoes;
	
	@Column
	private Calendar inicioAnoLetivo;
	
	@Column
	private Calendar fimAnoLetivo;
	
	@Column
	private Integer qtdUnidades;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Calendar getInicioAnoLetivo() {
		return inicioAnoLetivo;
	}

	public void setInicioAnoLetivo(Calendar inicioAnoLetivo) {
		this.inicioAnoLetivo = inicioAnoLetivo;
	}

	public Calendar getFimAnoLetivo() {
		return fimAnoLetivo;
	}

	public void setFimAnoLetivo(Calendar fimAnoLetivo) {
		this.fimAnoLetivo = fimAnoLetivo;
	}
	
}
