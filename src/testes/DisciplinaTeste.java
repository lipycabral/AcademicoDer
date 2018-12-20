package testes;

import entidades.Centro;
import entidades.Disciplina;
import repositorios.CentroRepo;
import repositorios.DisciplinaRepo;

public class DisciplinaTeste {

	public static void main(String[] args) {
		DisciplinaRepo dr = new DisciplinaRepo();
		CentroRepo cr = new CentroRepo();
		
		Disciplina d1, d2, d3, d4;
		Centro c1;
		c1 = cr.recuperar("CCZSL");
		
		d1 = new Disciplina();
		d1.setCodigo("CCET080");
		d1.setNome("Algebra Linear");
		d1.setCh(60);
		d1.setCentro(c1);
		
		d2 = new Disciplina();
		d2.setCodigo("CCET050");
		d2.setNome("Tesi 2");
		d2.setCh(60);
		d2.setCentro(c1);
		
		d3 = new Disciplina();
		d3.setCodigo("CCET032");
		d3.setNome("Tesi 1");
		d3.setCh(60);
		d3.setCentro(c1);
		
		d4 = new Disciplina();
		d4.setCodigo("CCET090");
		d4.setNome("Tesi 3");
		d4.setCh(60);
		d4.setCentro(c1);
		
		dr.adicionar(d1);
		dr.adicionar(d2);
		dr.adicionar(d3);
//		dr.adicionar(d4);
		
		cr.encerrar();
		dr.encerrar();
	}

}
