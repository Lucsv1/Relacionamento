package br.com.fiap.DAO;

import javax.persistence.EntityManager;

import br.com.fiap.Entity.Produto;
import br.com.fiap.jpa.dao.GenericDaoImpl;

public class ProdutoDaoImpl extends GenericDaoImpl<Produto, Integer> implements ProdutoDao {
	
	public ProdutoDaoImpl(EntityManager ent) {
		super(ent);
	}

}
