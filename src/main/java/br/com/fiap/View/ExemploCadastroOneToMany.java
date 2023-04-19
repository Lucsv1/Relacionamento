package br.com.fiap.View;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.DAO.ClienteDao;
import br.com.fiap.DAO.ClienteDaoImpl;
import br.com.fiap.Entity.Cliente;
import br.com.fiap.Entity.Pedido;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.sigleton.EntityManagerFactorySingleton;

public class ExemploCadastroOneToMany {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(0, null, null);
		Pedido pedido = new Pedido(null, 0);
		EntityManagerFactory fabrica  = EntityManagerFactorySingleton.getInstance();
		EntityManager ent = fabrica.createEntityManager();
		ClienteDao cliDao = new ClienteDaoImpl(ent);
		
		cliDao.salvar(cliente);
		try {
			cliDao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
		}
		

	}

}
