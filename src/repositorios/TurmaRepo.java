package repositorios;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entidades.Turma;

public class TurmaRepo {
	private EntityManagerFactory emf;
	private EntityManager em;
	public TurmaRepo() {
		emf = Persistence.createEntityManagerFactory("Academico");
		em = emf.createEntityManager();
	}
	public void adicionar(Turma turma) {
		em.getTransaction().begin();
		em.persist(turma);
		em.getTransaction().commit();
	}
	public Turma recuperar(Object id) {
		return em.find(Turma.class, id);
	}
	public void atualizar(Turma turma) {
		em.getTransaction().begin();
		em.merge(turma);
		em.getTransaction().commit();
	}
	public void remover(Turma turma) {
		em.getTransaction().begin();
		em.remove(turma);
		em.getTransaction().commit();
	}
	public void encerrar() {
		em.close();
		emf.close();
	}
}
