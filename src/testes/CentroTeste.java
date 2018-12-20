package testes;

import entidades.Centro;
import repositorios.CentroRepo;

public class CentroTeste {
	public static void main(String[] args) {
		CentroRepo cr = new CentroRepo();
		Centro c1, c2;
		
		c1 = new Centro();
		c1.setSigla("CCETC");
		c1.setNome("Centro de Ciências Exatas Tecnológicas e Comunicação");
		
		c2 = new Centro();
		c2.setSigla("CCZSL");
		c2.setNome("Centro de Ciências da Zoeira Sem Limites");
		
		cr.adicionar(c1);
		cr.adicionar(c2);
		
		System.out.println(cr.recuperar("CCETC"));
		System.out.println(cr.recuperar("CCZSL"));
		cr.encerrar();
	}
}
