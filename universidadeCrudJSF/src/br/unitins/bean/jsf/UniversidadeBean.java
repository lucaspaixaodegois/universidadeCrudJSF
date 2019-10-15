package br.unitins.bean.jsf;

import javax.ejb.EJB;
import javax.inject.Named;
import br.unitins.bean.ejb.UniversidadeEJB;
import br.unitins.model.Universidade;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;

@Named
@SessionScoped
public class UniversidadeBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9150890915669205445L;

	@EJB
	private UniversidadeEJB universidadeEJB;

	private Universidade universidade;

	private List<Universidade> universidades;
	private Boolean alterar = false;

	@PostConstruct
	public void init() {
		universidades = universidadeEJB.findAll();
	}

	public String inserir() {
		universidadeEJB.insert(universidade);
		novo();
		return null;
	}

	public String alterar(Universidade cli) {
		universidade = cli;
		alterar = true;
		return "cadastroUniversidade.xhtml?faces-redirect=true";
	}

	public String voltar() {
		universidadeEJB.update(universidade);
		alterar = false;
		return "universidade.xhtml?faces-redirect=true";
	}

	public String apagar(Universidade cli) {
		universidade = cli;
		universidadeEJB.delete(universidade);
		return null;
	}

	public String novo() {
		universidade = new Universidade();
		return null;
	}

	public Universidade getUniversidade() {
		if (universidade == null)
			universidade = new Universidade();
		return universidade;
	}

	public List<Universidade> getUniversidades() {
		if (universidades == null)
			universidades = new ArrayList<>();
		universidades = universidadeEJB.findAll();
		return universidades;
	}

	public Boolean getAlterar() {
		return alterar;
	}

	public void setAlterar(Boolean alterar) {
		this.alterar = alterar;
	}
}
