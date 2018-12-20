package testes;

import entidades.ChaveCompostaPK;
import entidades.Curso;
import entidades.Disciplina;
import entidades.Professor;
import entidades.Turma;
import repositorios.CursoRepo;
import repositorios.DisciplinaRepo;
import repositorios.ProfessorRepo;
import repositorios.TurmaRepo;

public class TurmaTeste {
	public static void main(String[] args) {
		TurmaRepo tr = new TurmaRepo();
		CursoRepo cr = new CursoRepo();
		DisciplinaRepo dr = new DisciplinaRepo();
		ProfessorRepo pr = new ProfessorRepo();
		
		Curso curso;
		curso = cr.recuperar(30);
		Disciplina disciplina;
		disciplina = dr.recuperar("CCET080");
		Professor professor;
		professor = pr.recuperar(20160300016L);
		ChaveCompostaPK chave;
		chave = new ChaveCompostaPK();
		chave.setAno(2018);
		chave.setSemestre(2);
		
		Turma turma;
		turma = new Turma();
		turma.setChavePk(chave);
		turma.setCurso(curso);
		turma.setDisciplina(disciplina);
		turma.setProfessor(professor);
		turma.setVagas(50);
		
//		tr.adicionar(turma);
		System.out.println(tr.recuperar(chave));
		
		pr.encerrar();
		dr.encerrar();
		cr.encerrar();
		tr.encerrar();
	}
}
