package br.unitins.bean.jsf;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.unitins.bean.ejb.UniversidadeEJB;
import br.unitins.model.Universidade;

@Named
@RequestScoped
public class UniversidadeBean {

	private Universidade universidade;
	
	@EJB
	private UniversidadeEJB universidadeEJB;
	 		
	public String salvar() {
		
		universidadeEJB.salvar(universidade, null);
		
		return null;
	}
	
	public Universidade getUniversidade() {
		
		if(universidade == null) {
			universidade = new Universidade();
		}		
		return universidade;
	}
	
	
}
