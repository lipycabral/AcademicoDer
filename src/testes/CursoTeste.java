package testes;

import java.util.List;

import entidades.Curso;
import repositorios.CursoRepo;

public class CursoTeste {
	public static void main(String[] args) {
		CursoRepo cr = new CursoRepo();
		
		Curso c1, c2, c3;
		c1 = new Curso();
		c1.setCodigo(1);
		c1.setNome("Direito");
		
		c2 = new Curso();
		c2.setCodigo(2);
		c2.setNome("Esquerdo");
		
		c3 = new Curso();
		c3.setCodigo(30);
		c3.setNome("Sistemas de informação");
		
		cr.adicionar(c1);
		cr.adicionar(c2);
		cr.adicionar(c3);
		
		System.out.println("Adicionando");
		List<Curso> cursos;
		cursos = cr.recuperarTodos();
		for (Curso curso : cursos) {
			System.out.println(curso);
		}
//		cursos = cr.recuperarPorNome("S");
//		for (Curso curso : cursos) {
//			System.out.println(curso);
//		}
		System.out.println("Atualizando");
		Curso cA = cr.recuperar(30);
		cA.setNome("Sistema de desinformação");
		cr.atualizar(cA);
		cursos = cr.recuperarTodos();
		for (Curso curso : cursos) {
			System.out.println(curso);
		}
		System.out.println("Removendo");
		Curso cR = cr.recuperar(1);
		cr.remover(cR);
		cursos = cr.recuperarTodos();
		for (Curso curso : cursos) {
			System.out.println(curso);
		}
		cr.encerrar();
		
	}
}
