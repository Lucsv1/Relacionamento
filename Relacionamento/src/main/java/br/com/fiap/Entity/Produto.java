package br.com.fiap.Entity;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name ="TB_PRODUTO")
@SequenceGenerator(sequenceName = "SQ_TB_PRODUTO", name = "produto", allocationSize = 1)
public class Produto {
	 
	

}
