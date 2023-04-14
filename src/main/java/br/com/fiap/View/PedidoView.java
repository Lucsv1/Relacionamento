package br.com.fiap.View;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.DAO.NotaFiscalDao;
import br.com.fiap.DAO.NotaFiscalDaoImpl;
import br.com.fiap.DAO.PedidoDao;
import br.com.fiap.DAO.PedidoDaoImpl;
import br.com.fiap.Entity.NotaFiscal;
import br.com.fiap.Entity.Pedido;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.sigleton.EntityManagerFactorySingleton;

public class PedidoView {

	public static void main(String[] args) {
		EntityManagerFactory factory = EntityManagerFactorySingleton.getInstance();
		EntityManager ent = factory.createEntityManager();
		
		PedidoDao pedidoDao = new PedidoDaoImpl(ent);
		
		Pedido pedido = new Pedido(Calendar.getInstance(), 50.0 );
		pedidoDao.salvar(pedido);
		try {
			pedidoDao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
		}
		
		NotaFiscalDao notaFiscalDao = new NotaFiscalDaoImpl(ent);
		
		NotaFiscal notaFiscal = new NotaFiscal( Calendar.getInstance(), 239.99, pedido);
		
		notaFiscalDao.salvar(notaFiscal);
		try {
			notaFiscalDao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
		}
		
		

	}

}
