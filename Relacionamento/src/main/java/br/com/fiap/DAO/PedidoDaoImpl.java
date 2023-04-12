package br.com.fiap.DAO;

import javax.persistence.EntityManager;

import br.com.fiap.Entity.Pedido;
import br.com.fiap.jpa.dao.GenericDaoImpl;

public class PedidoDaoImpl extends GenericDaoImpl<Pedido, Integer> implements PedidoDao{
	
	public PedidoDaoImpl(EntityManager ent) {
		super(ent);
	}

}
