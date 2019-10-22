package br.unitins.bean.jsf;

import javax.ejb.EJB;
import javax.inject.Named;
import br.unitins.bean.ejb.GradePeriodoEJB;
import br.unitins.model.GradePeriodo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;

@Named
@SessionScoped
public class GradePeriodoBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9150890915669205445L;

	@EJB
	private GradePeriodoEJB gradePeriodoEJB;

	private GradePeriodo gradePeriodo;

	private List<GradePeriodo> gradePeriodos;
	private Boolean alterar = false;

	@PostConstruct
	public void init() {
		gradePeriodos = gradePeriodoEJB.findAll();
	}

	public String inserir() {
		gradePeriodoEJB.insert(gradePeriodo);
		novo();
		return null;
	}

	public String alterar(GradePeriodo cli) {
		gradePeriodo = cli;
		alterar = true;
		return "cadastroGradePeriodo.xhtml?faces-redirect=true";
	}

	public String voltar() {
		gradePeriodoEJB.update(gradePeriodo);
		alterar = false;
		return "gradePeriodo.xhtml?faces-redirect=true";
	}

	public String apagar(GradePeriodo cli) {
		gradePeriodo = cli;
		gradePeriodoEJB.delete(gradePeriodo);
		return null;
	}

	public String novo() {
		gradePeriodo = new GradePeriodo();
		return null;
	}

	public GradePeriodo getGradePeriodo() {
		if (gradePeriodo == null)
			gradePeriodo = new GradePeriodo();
		return gradePeriodo;
	}

	public List<GradePeriodo> getGradePeriodos() {
		if (gradePeriodos == null)
			gradePeriodos = new ArrayList<>();
		gradePeriodos = gradePeriodoEJB.findAll();
		return gradePeriodos;
	}

	public Boolean getAlterar() {
		return alterar;
	}

	public void setAlterar(Boolean alterar) {
		this.alterar = alterar;
	}
}
