package br.com.fiap.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name ="TB_PRODUTO")
@SequenceGenerator(sequenceName = "SQ_TB_PRODUTO", name = "produto", allocationSize = 1)
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto")
	@Column(name ="cd_ produto")
	private int codigoProduto;
	
	@Column(name = "nm_poduto", nullable = false, length = 80 )
	private String nomeProduto;
	
	@Column(name = "vl_produto", nullable = false, precision = 10, scale = 2 )
	private double valorProduto;
	
	@Column(name = "qntd_estoque", precision =  5)
	private int qntdEstoque;
	
	public Produto() {
		
	}

	public Produto(int codigoProduto, String nomeProduto, double valorProduto, int qntdEstoque) {
		super();
		this.codigoProduto = codigoProduto;
		this.nomeProduto = nomeProduto;
		this.valorProduto = valorProduto;
		this.qntdEstoque = qntdEstoque;
	}
	

	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}

	public int getQntdEstoque() {
		return qntdEstoque;
	}

	public void setQntdEstoque(int qntdEstoque) {
		this.qntdEstoque = qntdEstoque;
	}
	
	
	
	
	 
	

}
