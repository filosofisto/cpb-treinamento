package curso.jpa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "MATERIAL")
public class Material implements Serializable {

	private static final long serialVersionUID = -5829360774295912850L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_MATERIAL", nullable=false, unique=true)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="ID_EVENTO", nullable=false)
	//@ManyToMany(mappedBy="materiais", fetch=FetchType.LAZY)
	private Evento evento;
	
	@Column(name="REFERENCIA", nullable=false)
	private String referencia;
	
	@Column(name="DESCRICAO", nullable=false)
	private String descricao;
	
	@Column(name="QUANTIDADE", nullable=false)
	private Float quantidade;
	
	@Column(name="VALOR_UNITARIO", nullable=false)
	private Float valorUnitario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Float quantidade) {
		this.quantidade = quantidade;
	}

	public Float getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Float valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	public Float getValorTotal() {
		return getQuantidade()*getValorUnitario();
	}
}

