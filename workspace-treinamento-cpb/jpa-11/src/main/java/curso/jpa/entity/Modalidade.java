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
@Table(schema="cpb_treinamento", name="MODALIDADE")
public class Modalidade implements Serializable {

	private static final long serialVersionUID = 9123278328750705288L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_MODALIDADE", nullable=false)
    private Long id;

    @Column(name="NOME", nullable=false, length=45, unique=true)
    private String nome;

	@ManyToOne
	@JoinColumn(name = "ID_CONFEDERACAO")
	private Confederacao confederacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Confederacao getConfederacao() {
		return confederacao;
	}

	public void setConfederacao(Confederacao confederacao) {
		this.confederacao = confederacao;
	}
}
