package br.unitins.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class GradeDisciplina {
	@Id
	@GeneratedValue
	private Integer codigo;
	@Column
	private Integer ano;
	@Column
	private List<Periodo> perido;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public List<Periodo> getPerido() {
		return perido;
	}

	public void setPerido(List<Periodo> perido) {
		this.perido = perido;
	}

}
