package br.com.caelum.vraptor.backend.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Consulta implements Serializable{

	/**
	 * UUID
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Date data;
	private Anamnese anamnese;

	@Id
	@SequenceGenerator(name="seq_consulta", sequenceName="seq_consulta", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.IDENTITY, generator="seq_consulta")
	@Column(name="id_consulta",nullable=false)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "cadastro", updatable = true)
	@Temporal(TemporalType.DATE)
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@OneToOne
	public Anamnese getAnamnese() {
		return anamnese;
	}
	public void setAnamnese(Anamnese anamnese) {
		this.anamnese = anamnese;
	}

}
