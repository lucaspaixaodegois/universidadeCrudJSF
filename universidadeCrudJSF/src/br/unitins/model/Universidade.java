package br.unitins.model;

import javax.persistence.*;

@Entity
public class Universidade {

	@Id
	@GeneratedValue
	private Integer id;
	@Column
	private String nome;

	public Universidade() {
		super();
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
