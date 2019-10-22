package br.unitins.bean.ejb;

import java.util.List;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.unitins.model.GradePeriodo;

@Stateful
public class GradePeriodoEJB {
	@PersistenceContext
	private EntityManager em;

	public void insert(GradePeriodo gradePeriodo) {
		em.persist(gradePeriodo);
	}

	public void update(GradePeriodo gradePeriodo) {
		em.merge(gradePeriodo);
	}

	public void delete(GradePeriodo gradePeriodo) {
		System.out.println("Objeto: " + gradePeriodo.getCodigo());
		gradePeriodo = load(gradePeriodo.getCodigo());
		em.remove(gradePeriodo);
	}

	public GradePeriodo load(Integer id) {
		return em.find(GradePeriodo.class, id);
	}

	public List<GradePeriodo> findAll() {
		return em.createQuery("select c from GradePeriodo c", GradePeriodo.class).getResultList();
	}
}