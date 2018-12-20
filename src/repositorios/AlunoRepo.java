package repositorios;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entidades.Aluno;

public class AlunoRepo {
	private EntityManagerFactory emf;
	private EntityManager em;
	public AlunoRepo() {
		emf = Persistence.createEntityManagerFactory("Academico");
		em = emf.createEntityManager();
	}
	
	public void adicionar(Aluno aluno) {
		em.getTransaction().begin();
		em.persist(aluno);
		em.getTransaction().commit();
	}
	public Aluno recuperar(long matricula) {
		return em.find(Aluno.class, matricula);
	}
	public void atualizar(Aluno aluno) {
		em.getTransaction().begin();
		em.merge(aluno);
		em.getTransaction().commit();
	}
	public void remover(Aluno aluno) {
		em.getTransaction().begin();
		em.remove(aluno);
		em.getTransaction().commit();
	}
	
	@SuppressWarnings("unchecked")
	public List<Aluno> recuperarTodos(){
		return em.createNamedQuery("AlunosTodos").getResultList();
	}
	public void encerrar() {
		em.close();
		emf.close();
	}
}
