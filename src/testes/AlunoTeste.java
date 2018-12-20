package testes;

import java.util.List;

import entidades.Aluno;
import entidades.Curso;
import repositorios.AlunoRepo;
import repositorios.CursoRepo;

public class AlunoTeste {
	public static void main(String[] args) {
		AlunoRepo ar = new AlunoRepo();
		CursoRepo cr = new CursoRepo();
		
		Aluno a1, a2;
		Curso  c1, c3;
		c1 = cr.recuperar(2);
		c3 = cr.recuperar(30);
		System.out.println(c1);
		System.out.println(c3);
		
		a1 = new Aluno();
		a1.setMatricula(1);
		a1.setNome("Felipy da Costa Cabral");
		a1.setFone("(68)999645389");
		a1.setCep("69903024");
		a1.setEndereco("Rua Jambo, 225");
		a1.setSexo("M");
		a1.setCurso(c3);
		System.out.println(a1);
		
		a2 = new Aluno();
		a2.setMatricula(50);
		a2.setNome("Tainá Cavalcante Bezerra");
		a2.setFone("(68)999665544");
		a2.setCep("6990301");
		a2.setEndereco("Rua Dezembro, 13");
		a2.setSexo("F");
		a2.setCurso(c1);
		System.out.println(a2);
		
		ar.adicionar(a1);
		ar.adicionar(a2);
		
		List<Aluno> alunos;
		alunos = ar.recuperarTodos();
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}
		
		cr.encerrar();
		ar.encerrar();
		
	}
}
