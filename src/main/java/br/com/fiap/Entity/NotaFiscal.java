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
@Table(name = "TB_NOTAFISCAL")
@SequenceGenerator(sequenceName = "SQ_TB_NOTAFISCAL", allocationSize = 1, name = "notaFiscal")
public class NotaFiscal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "notaFiscal")
	@Column(name = "cd_nota")
	private int cd_nota;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name ="dt_nota", nullable = false)
	private Calendar dt_nota;
	
	@Column(name = "vl_nota", nullable = false, precision = 10, scale = 2)
	private double vl_nota;
	
	@OneToOne
	@JoinColumn(name = "cd_pedido", nullable = false)
	private Pedido pedido;
	
	
	public NotaFiscal () {
		
	}

	public NotaFiscal( Calendar dt_nota, double vl_nota, Pedido pedido) {
		this.pedido = pedido;
		this.dt_nota = dt_nota;
		this.vl_nota = vl_nota;
	}
	
	
	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public int getCd_nota() {
		return cd_nota;
	}

	public void setCd_nota(int cd_nota) {
		this.cd_nota = cd_nota;
	}

	public Calendar getDt_nota() {
		return dt_nota;
	}

	public void setDt_nota(Calendar dt_nota) {
		this.dt_nota = dt_nota;
	}

	public double getVl_nota() {
		return vl_nota;
	}

	public void setVl_nota(double vl_nota) {
		this.vl_nota = vl_nota;
	}
	
	

}
