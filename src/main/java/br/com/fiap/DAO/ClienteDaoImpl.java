package br.com.fiap.DAO;

import javax.persistence.EntityManager;

import br.com.fiap.Entity.Cliente;
import br.com.fiap.jpa.dao.GenericDaoImpl;

public class ClienteDaoImpl extends GenericDaoImpl<Cliente, Integer> implements ClienteDao  {
	
	public ClienteDaoImpl(EntityManager ent) {
		super(ent);
	}

}
