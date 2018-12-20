package repositorios;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entidades.Curso;
import entidades.Estrutura;

public class EstruturaRepo {
	private EntityManagerFactory emf;
	private EntityManager em;
	public EstruturaRepo() {
		emf = Persistence.createEntityManagerFactory("Academico");
		em = emf.createEntityManager();
	}
	public void adicionar(Estrutura estrutura) {
		em.getTransaction().begin();
		em.persist(estrutura);
		em.getTransaction().commit();
	}
	public Estrutura recuperar(long id) {
		return em.find(Estrutura.class, id);
	}
	public void atualizar(Estrutura estrutura) {
		em.getTransaction().begin();
		em.merge(estrutura);
		em.getTransaction().commit();
	}
	public void remover(Estrutura estrutura) {
		em.getTransaction().begin();
		em.remove(estrutura);
		em.getTransaction().commit();
	}
	public void encerrar() {
		em.close();
		emf.close();
	}
}
