package testes;

import entidades.Curso;
import entidades.Disciplina;
import entidades.Estrutura;
import repositorios.CursoRepo;
import repositorios.DisciplinaRepo;
import repositorios.EstruturaRepo;

public class EstruturaTeste {
	public static void main(String[] args) {
		EstruturaRepo er = new EstruturaRepo();
		DisciplinaRepo dr = new DisciplinaRepo();
		CursoRepo cr = new CursoRepo();
		
		Curso c;
		c = cr.recuperar(30);
		
		Disciplina d1, d2, d3, d4;
		d1 = dr.recuperar("CCET032");
		d2 = dr.recuperar("CCET050");
		d3 = dr.recuperar("CCET080");
 		d4 = dr.recuperar("CCET090");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
//		Estrutura e1;
//		e1 = new Estrutura();
//		e1.setCurso(c);
//		e1.setPeriodo(1);
//		e1.adicionarDisciplina(d1);
//		e1.adicionarDisciplina(d2);
//		e1.adicionarDisciplina(d3);
//		System.out.println(e1);
//		er.adicionar(e1);
		
		Estrutura eR;
		eR = er.recuperar(2);
//		eR.adicionarDisciplina(d4);
		eR.removerDisciplina(eR.getDisciplinaEspecifica("CCET090"));
		System.out.println(eR);
		er.atualizar(eR);
		System.out.println(eR);
//		er.remover(eR);
		
		cr.encerrar();
		dr.encerrar();
		er.encerrar();
	}
}
