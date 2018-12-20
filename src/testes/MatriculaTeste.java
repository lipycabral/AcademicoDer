package testes;

import entidades.Aluno;
import entidades.ChaveCompostaPK;
import entidades.Curso;
import entidades.Disciplina;
import entidades.Matricula;
import repositorios.AlunoRepo;
import repositorios.CursoRepo;
import repositorios.DisciplinaRepo;
import repositorios.MatriculaRepo;

public class MatriculaTeste {
	public static void main(String[] args) {
		MatriculaRepo mr = new MatriculaRepo();
		CursoRepo cr = new CursoRepo();
		DisciplinaRepo dr = new DisciplinaRepo();
		AlunoRepo ar = new AlunoRepo();
		
		Curso curso;
		curso = cr.recuperar(30);
		
		Disciplina disciplina;
		disciplina = dr.recuperar("CCET080");
		
		Aluno aluno;
		aluno = ar.recuperar(1);
		
		ChaveCompostaPK chave;
		chave = new ChaveCompostaPK();
		chave.setAno(2018);
		chave.setSemestre(2);
		
		Matricula matricula;
		matricula = new Matricula();
		matricula.setCurso(curso);
		matricula.setDisciplina(disciplina);
		matricula.setChave(chave);
		matricula.setAluno(aluno);
		matricula.setN1(9);
		matricula.setN2(9.55);
		
//		mr.adicionar(matricula);
		
		System.out.println(mr.recuperar(1));
		
		ar.encerrar();
		dr.encerrar();
		cr.encerrar();
		mr.encerrar();
	}
}
