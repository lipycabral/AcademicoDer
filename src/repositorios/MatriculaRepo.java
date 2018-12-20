package repositorios;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entidades.Matricula;

public class MatriculaRepo {
	private EntityManagerFactory emf;
	private EntityManager em;
	public MatriculaRepo() {
		emf = Persistence.createEntityManagerFactory("Academico");
		em = emf.createEntityManager();
	}
	public void adicionar(Matricula matricula) {
		em.getTransaction().begin();
		em.persist(matricula);
		em.getTransaction().commit();
	}
	public Matricula recuperar(long id) {
		return em.find(Matricula.class, id);
	}
	public void atualizar(Matricula matricula) {
		em.getTransaction().begin();
		em.merge(matricula);
		em.getTransaction().commit();
	}
	public void remover(Matricula matricula) {
		em.getTransaction().begin();
		em.remove(matricula);
		em.getTransaction().commit();
	}
	public void encerrar() {
		em.close();
		emf.close();
	}
}
