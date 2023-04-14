package br.com.fiap.DAO;

import javax.persistence.EntityManager;

import br.com.fiap.Entity.NotaFiscal;
import br.com.fiap.jpa.dao.GenericDaoImpl;

public class NotaFiscalDaoImpl extends GenericDaoImpl<NotaFiscal, Integer> implements NotaFiscalDao {
	public NotaFiscalDaoImpl(EntityManager ent) {
		super(ent);
	}

}
