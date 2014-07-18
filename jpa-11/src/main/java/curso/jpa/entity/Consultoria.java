package curso.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TB003_CONSULTORIA")
public class Consultoria {

	@Id
	private ConsultoriaPK id;
	
	@ManyToOne
	@JoinColumn(name="ID_CONSULTOR", insertable=false, updatable=false)
	private Consultor consutor;
	
	@ManyToOne
	@JoinColumn(name="ID_EMPRESA", insertable=false, updatable=false)
	private Empresa empresa;
	
	@Column(name="VALOR_HORA")
	private Float valorHora;

	public ConsultoriaPK getId() {
		return id;
	}

	public void setId(ConsultoriaPK id) {
		this.id = id;
	}

	public Float getValorHora() {
		return valorHora;
	}

	public void setValorHora(Float valorHora) {
		this.valorHora = valorHora;
	}

	public Consultor getConsutor() {
		return consutor;
	}

	public void setConsutor(Consultor consutor) {
		this.consutor = consutor;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
}
