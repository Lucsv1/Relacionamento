package br.com.fiap.Entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name ="TB_PEDIDO")
@SequenceGenerator(sequenceName = "SQ_TB_PEDIDO",name = "pedido", allocationSize = 1)
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pedido")
	private int cd_pedido;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dt_pedido", nullable = false)
	private Calendar dt_pedido;
	
	@Column(name ="vl_pedido", nullable = false, precision = 5, scale = 2 )
	private double vl_pedido;
	

}
