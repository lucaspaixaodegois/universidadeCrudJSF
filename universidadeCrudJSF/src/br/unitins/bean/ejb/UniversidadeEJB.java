package br.unitins.bean.ejb;

import javax.ejb.Stateless;

import br.unitins.model.Universidade;

@Stateless
public class UniversidadeEJB {

	public void salvar(Universidade universidade, String campus) {
		
		universidade.setCampus(campus);
	}
	
}
 