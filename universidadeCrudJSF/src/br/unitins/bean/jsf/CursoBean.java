package br.unitins.bean.jsf;

import javax.ejb.EJB;
import javax.inject.Named;
import br.unitins.bean.ejb.CursoEJB;
import br.unitins.model.Curso;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;

@Named
@SessionScoped
public class CursoBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9150890915669205445L;

	@EJB
	private CursoEJB cursoEJB;

	private Curso curso;

	private List<Curso> cursos;
	private Boolean alterar = false;

	@PostConstruct
	public void init() {
		cursos = cursoEJB.findAll();
	}

	public String inserir() {
		cursoEJB.insert(curso);
		novo();
		return null;
	}

	public String alterar(Curso cli) {
		curso = cli;
		alterar = true;
		return "cadastroCurso.xhtml?faces-redirect=true";
	}

	public String voltar() {
		cursoEJB.update(curso);
		alterar = false;
		return "curso.xhtml?faces-redirect=true";
	}

	public String apagar(Curso cli) {
		curso = cli;
		cursoEJB.delete(curso);
		return null;
	}

	public String novo() {
		curso = new Curso();
		return null;
	}

	public Curso getCurso() {
		if (curso == null)
			curso = new Curso();
		return curso;
	}

	public List<Curso> getCursos() {
		if (cursos == null)
			cursos = new ArrayList<>();
		cursos = cursoEJB.findAll();
		return cursos;
	}

	public Boolean getAlterar() {
		return alterar;
	}

	public void setAlterar(Boolean alterar) {
		this.alterar = alterar;
	}
}
