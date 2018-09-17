package br.gov.ba.pm.escolar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Professor extends Pessoa{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id;
	
	@Column
	private Integer matriculaEstado;
	
	@OneToOne
	private EstadoCivil estadoCivil;
	
	@OneToOne
	private Endereco endereco;
	
	@OneToOne
	private Contato contato;
	
	@OneToOne
	private AreaFormacao areaFormacao;
	
	@Column
	@Enumerated(EnumType.STRING) 
	private Titulacao titulacao;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMatriculaEstado() {
		return matriculaEstado;
	}

	public void setMatriculaEstado(Integer matriculaEstado) {
		this.matriculaEstado = matriculaEstado;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public AreaFormacao getAreaFormacao() {
		return areaFormacao;
	}

	public void setAreaFormacao(AreaFormacao areaFormacao) {
		this.areaFormacao = areaFormacao;
	}
	
	public Titulacao getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(Titulacao titulacao) {
		this.titulacao = titulacao;
	}
	
}
