package repositorios;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entidades.Professor;

public class ProfessorRepo {
	private EntityManagerFactory emf;
	private EntityManager em;
	public ProfessorRepo() {
		emf = Persistence.createEntityManagerFactory("Academico");
		em = emf.createEntityManager();
	}
	public void adicionar(Professor professor) {
		em.getTransaction().begin();
		em.persist(professor);
		em.getTransaction().commit();
	}
	public Professor recuperar(long matricula) {
		return em.find(Professor.class, matricula);
	}
	public void atualizar(Professor professor) {
		em.getTransaction().begin();
		em.merge(professor);
		em.getTransaction().commit();
	}
	public void remover(Professor professor) {
		em.getTransaction().begin();
		em.remove(professor);
		em.getTransaction().commit();
	}
	public void encerrar() {
		em.close();
		emf.close();
	}
}
