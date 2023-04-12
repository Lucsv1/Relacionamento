package br.com.fiap.Entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
	@Column(name = "cd_cliente")
	private int cd_pedido;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_pedido", nullable = false)
	private Calendar dt_pedido;
	
	@Column(name ="vl_pedido", nullable = false, precision = 5, scale = 2 )
	private double vl_pedido;
	
	@OneToOne(mappedBy = "pedido")
	private NotaFiscal nota;
	
	public Pedido() {
		
	}

	public Pedido( Calendar dt_pedido, double vl_pedido) {
		this.dt_pedido = dt_pedido;
		this.vl_pedido = vl_pedido;
	}

	public int getCd_pedido() {
		return cd_pedido;
	}

	public void setCd_pedido(int cd_pedido) {
		this.cd_pedido = cd_pedido;
	}

	public Calendar getDt_pedido() {
		return dt_pedido;
	}

	public void setDt_pedido(Calendar dt_pedido) {
		this.dt_pedido = dt_pedido;
	}

	public double getVl_pedido() {
		return vl_pedido;
	}

	public void setVl_pedido(double vl_pedido) {
		this.vl_pedido = vl_pedido;
	}
	
	
	

}
