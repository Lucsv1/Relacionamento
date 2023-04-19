package br.com.fiap.View;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

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
		List<Pedido> pedidos = new ArrayList<Pedido>();
		Cliente cliente = new Cliente("Kkbr", Calendar.getInstance(), pedidos);
		Pedido pedido1 = new Pedido(Calendar.getInstance(), 200.0);
		Pedido pedido2 = new Pedido(Calendar.getInstance(), 200.0);
		cliente.addPedido(pedido2);
		cliente.addPedido(pedido1);
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
