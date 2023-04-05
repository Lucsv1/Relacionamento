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

import org.hibernate.annotations.Generated;

@Entity
@Table(name="TB_CLIENTE")
@SequenceGenerator(sequenceName = "tb_cliente", name = "cliente", allocationSize = 1)
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente")
	private int cd_cliente;
	
	@Column(name ="nm_cliente", nullable = false, length = 80)
	private String nm_cliente;
	
	@Temporal(TemporalType.DATE)
	@Column(name ="dt_nascimento")
	private Calendar dt_nascimento;
	

}
