package repositorios;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entidades.Curso;

public class CursoRepo {
	private EntityManagerFactory emf;
	private EntityManager em;
	public CursoRepo() {
		// TODO Auto-generated constructor stub
		emf = Persistence.createEntityManagerFactory("Academico");
		em = emf.createEntityManager();
	}
	
	public void adicionar(Curso curso) {
		em.getTransaction().begin();
		em.persist(curso);
		em.getTransaction().commit();
	}
	public Curso recuperar(int id) {
		return em.find(Curso.class, id);
	}
	public void atualizar(Curso curso) {
		em.getTransaction().begin();
		em.merge(curso);
		em.getTransaction().commit();
	}
	public void remover(Curso curso) {
		em.getTransaction().begin();
		em.remove(curso);
		em.getTransaction().commit();
	}
	@SuppressWarnings("unchecked")
	public List<Curso> recuperarTodos(){
		return em.createNamedQuery("CursoTodos").getResultList();
	}
	@SuppressWarnings("unchecked")
	public List<Curso> recuperarPorNome(String nome){
		return em.createNamedQuery("CursoPorNome").setParameter("nome", "%"+nome+"%").getResultList();
	}
	public void encerrar() {
		em.close();
		emf.close();
	}
	
}
