package repositorios;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entidades.Centro;

public class CentroRepo {
	private EntityManagerFactory emf;
	private EntityManager em;
	public CentroRepo() {
		emf = Persistence.createEntityManagerFactory("Academico");
		em = emf.createEntityManager();
	}
	public void adicionar(Centro centro) {
		em.getTransaction().begin();
		em.persist(centro);
		em.getTransaction().commit();
	}
	public Centro recuperar(String sigla) {
		return em.find(Centro.class, sigla);
	}
	public void atualizar(Centro centro) {
		em.getTransaction().begin();
		em.merge(centro);
		em.getTransaction().commit();
	}
	public void remover(Centro centro) {
		em.getTransaction().begin();
		em.remove(centro);
		em.getTransaction().commit();
	}
	public void encerrar() {
		em.close();
		emf.close();
	}
}
