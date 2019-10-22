package br.unitins.model;

import javax.persistence.*;

@Entity
public class Usuario {
	@Id
	@GeneratedValue
	private Integer codigo;
	@Column
	private String curso;

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}