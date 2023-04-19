package br.com.fiap.View;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.DAO.NotaFiscalDao;
import br.com.fiap.DAO.NotaFiscalDaoImpl;
import br.com.fiap.Entity.NotaFiscal;
import br.com.fiap.jpa.exception.EntidadeNaoEcontradaException;
import br.com.fiap.jpa.sigleton.EntityManagerFactorySingleton;

public class ExemploPesquisa {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fabrica.createEntityManager();
		
		//Instanciar o DAO da Nota
		NotaFiscalDao notaDao = new NotaFiscalDaoImpl(em);
		
		try {
			//Pesquisar a nota fiscal pelo ID
			NotaFiscal nota = notaDao.buscar(6);
			
			//Exibir o Valor da Nota Fiscal e o Valor do Pedido
			System.out.println("Valor da nota: " + nota.getVl_nota());
			System.out.println("Valor do pedido: " + nota.getPedido().getVl_pedido());
		} catch(EntidadeNaoEcontradaException e) {
			System.out.println(e.getMessage());
		}
	}
}