package br.gov.ba.pm.escolar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Funcionario extends Pessoa{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id;
	
	@Column
	private Integer matriculaEstado;
	
	@OneToOne
	private Contato contato;
	
	@OneToOne
	private Funcao funcao;
	
	@OneToOne
	private AreaFormacao areaformacao;

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

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Funcao getFuncao() {
		return funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}

	public AreaFormacao getAreaformacao() {
		return areaformacao;
	}

	public void setAreaformacao(AreaFormacao areaformacao) {
		this.areaformacao = areaformacao;
	}

}
