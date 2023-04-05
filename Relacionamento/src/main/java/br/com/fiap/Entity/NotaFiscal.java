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
@Table(name = "TB_NOTAFISCAL")
@SequenceGenerator(sequenceName = "SQ_TB_NOTAFISCAL", allocationSize = 1, name = "notaFiscal")
public class NotaFiscal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "notaFiscal")
	private int cd_nota;

	@Temporal(TemporalType.DATE)
	@Column(name ="dt_nota", nullable = false)
	private Calendar dt_nota;
	
	@Column(name = "vl_nota", nullable = false, precision = 10, scale = 2)
	private double vl_nota;

}
