package br.unitins.model;

import java.util.List;

public class GradeDisciplina {

	private Integer codigo;
	private String nome;
	private String campus;
	private String cnpj;
	private List<Aluno> discentes;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCampus() {
		return campus;
	}

	public void setCampus(String campus) {
		this.campus = campus;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Aluno> getDiscentes() {
		return discentes;
	}

	public void setDiscentes(List<Aluno> discentes) {
		this.discentes = discentes;
	}

}
