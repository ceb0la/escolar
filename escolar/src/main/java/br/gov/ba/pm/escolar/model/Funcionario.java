package br.gov.ba.pm.escolar.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Funcionario extends Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column
	private Integer matricula;
	
	@Column
	@Enumerated(EnumType.STRING)
	private Vinculo vinculo;
	
	@Column
	@Enumerated(EnumType.STRING) 
	private TipoServidor tipoServidor;	
	
	@OneToOne
	private Contato contato;
	
	//@OneToOne	
	private Endereco endereco;
	
	@OneToOne
	private Funcao funcao;
	
	//@OneToOne
	private EstadoCivil estadoCivil;
	
	@OneToOne
	private AreaFormacao areaformacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
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

	public Vinculo getVinculo() {
		return vinculo;
	}

	public void setVinculo(Vinculo vinculo) {
		this.vinculo = vinculo;
	}

	public TipoServidor getTipoServidor() {
		return tipoServidor;
	}

	public void setTipoServidor(TipoServidor tipoServidor) {
		this.tipoServidor = tipoServidor;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	

}
