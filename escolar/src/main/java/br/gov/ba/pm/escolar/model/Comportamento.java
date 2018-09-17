package br.gov.ba.pm.escolar.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Comportamento implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id;

}
