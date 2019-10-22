package br.unitins.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Professor extends Usuario {

	@GeneratedValue
	private Integer codigo;
	@Column
	private String campus;
	@Column
	private List<Disciplina> disciplinas;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getCampus() {
		return campus;
	}

	public void setCampus(String campus) {
		this.campus = campus;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
}
