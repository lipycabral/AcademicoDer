package testes;

import entidades.Centro;
import entidades.Professor;
import repositorios.CentroRepo;
import repositorios.ProfessorRepo;

public class ProfessorTeste {
	public static void main(String[] args) {
		ProfessorRepo pr = new ProfessorRepo();
		CentroRepo cr = new CentroRepo();
		
		Centro centro;
		centro = cr.recuperar("CCZSL");
		
		Professor p1, p2;
		
		p1 = new Professor();
		p1.setMatricula(20160300016L);
		p1.setNome("Felipy da Costa Cabral");
		p1.setRg("11049707");
		p1.setCpf("52226727272");
		p1.setEnderenco("Rua Jambo, 225");
		p1.setFone("(68)999645389");
		p1.setCentro(centro);
		
		p2 = new Professor();
		p2.setMatricula(20160300032L);
		p2.setNome("Macilon Costa");
		p2.setRg("15566732");
		p2.setCpf("36032816249");
		p2.setEnderenco("Rua 25 de Dezembro, 13");
		p2.setFone("(68)999627994");
		p2.setCentro(centro);
		
//		pr.adicionar(p1);
//		pr.adicionar(p2);
		
		Professor pR1, pR2;
		pR1 = pr.recuperar(20160300016L);
		pR2 = pr.recuperar(20160300032L);
		
		System.out.println(pR1);
		System.out.println(pR2);
		
		cr.encerrar();
		pr.encerrar();
	}
}
