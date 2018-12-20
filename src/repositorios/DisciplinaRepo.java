package repositorios;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entidades.Disciplina;

public class DisciplinaRepo {
	private EntityManagerFactory emf;
	private EntityManager em;
	public DisciplinaRepo() {
		emf = Persistence.createEntityManagerFactory("Academico");
		em = emf.createEntityManager();
	}
	public void adicionar(Disciplina disciplina) {
		em.getTransaction().begin();
		em.persist(disciplina);
		em.getTransaction().commit();
	}
	public Disciplina recuperar(String codigo) {
		return em.find(Disciplina.class, codigo);
	}
	public void atualizar(Disciplina disciplina) {
		em.getTransaction().begin();
		em.merge(disciplina);
		em.getTransaction().commit();
	}
	public void remover(Disciplina disciplina) {
		em.getTransaction().begin();
		em.remove(disciplina);
		em.getTransaction().commit();
	}
	public void encerrar() {
		em.close();
		emf.close();
	}
}
