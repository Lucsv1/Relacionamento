package br.com.fiap.Entity;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Generated;

@Entity
@Table(name="TB_CLIENTE")
@SequenceGenerator(sequenceName = "tb_cliente", name = "cliente", allocationSize = 1)
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente")
	@Column(name = "cd_cliente")
	private int cd_cliente;
	
	@Column(name ="nm_cliente", nullable = false, length = 80)
	private String nm_cliente;
	
	@Temporal(TemporalType.DATE)
	@Column(name ="dt_nascimento")
	private Calendar dt_nascimento;
	
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	private List<Pedido> pedidos;
	
	public Cliente() {
		
	}

	public Cliente(int cd_cliente, String nm_cliente, Calendar dt_nascimento) {
		super();
		this.cd_cliente = cd_cliente;
		this.nm_cliente = nm_cliente;
		this.dt_nascimento = dt_nascimento;
	}
	

	public int getCd_cliente() {
		return cd_cliente;
	}

	public void setCd_cliente(int cd_cliente) {
		this.cd_cliente = cd_cliente;
	}

	public String getNm_cliente() {
		return nm_cliente;
	}

	public void setNm_cliente(String nm_cliente) {
		this.nm_cliente = nm_cliente;
	}

	public Calendar getDt_nascimento() {
		return dt_nascimento;
	}

	public void setDt_nascimento(Calendar dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}
	
	

}
