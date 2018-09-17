package br.gov.ba.pm.escolar.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Frequencia implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer Long;
	
	@Column
	private Calendar data;

	public Integer getLong() {
		return Long;
	}

	public void setLong(Integer l) {
		Long = l;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}
	
}
