package br.unitins.model;

import javax.persistence.*;

@Entity
public class Periodo {
	@Id
	@GeneratedValue
	private Integer codigo;
	@Column
	private String nome;
	@Column
	private Integer numPeriodo;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getNumPeriodo() {
		return numPeriodo;
	}

	public void setNumPeriodo(Integer numPeriodo) {
		this.numPeriodo = numPeriodo;
	}
}