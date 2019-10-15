package br.unitins.bean.ejb;

import java.util.List;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.unitins.model.Universidade;

@Stateful
public class UniversidadeEJB {
	@PersistenceContext
	private EntityManager em;

	public void insert(Universidade universidade) {
		em.persist(universidade);
	}

	public void update(Universidade universidade) {
		em.merge(universidade);
	}

	public void delete(Universidade universidade) {
		System.out.println("Objeto: " + universidade.getId());
		universidade = load(universidade.getId());
		em.remove(universidade);
	}

	public Universidade load(Integer id) {
		return em.find(Universidade.class, id);
	}

	public List<Universidade> findAll() {
		return em.createQuery("select c from Universidade c", Universidade.class).getResultList();
	}
}