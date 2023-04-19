package br.com.fiap.Entity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
	private List<Pedido> pedidos = new ArrayList<Pedido>();
	
	public void addPedido(Pedido pedidoNovo) {
		pedidoNovo.setCliente(this);
		this.pedidos.add(pedidoNovo);
	}
	
	public Cliente() {
		
	}

	public Cliente( String nm_cliente, Calendar dt_nascimento, List<Pedido> pedidos ) {
		super();
		this.nm_cliente = nm_cliente;
		this.dt_nascimento = dt_nascimento;
		this.pedidos = (List<Pedido>) pedidos;
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
