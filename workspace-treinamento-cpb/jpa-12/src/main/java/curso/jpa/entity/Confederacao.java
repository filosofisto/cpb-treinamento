package curso.jpa.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(schema="cpb_treinamento", name = "CONFEDERACAO")
public class Confederacao implements Serializable {

	private static final long serialVersionUID = 1983843270911949537L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_CONFEDERACAO", nullable=false)
    private Long id;

    @Column(name="NOME", nullable=false, length=100, unique=true)
    private String nome;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Modalidade> modalidades = new ArrayList<Modalidade>();

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

	public List<Modalidade> getModalidades() {
		return modalidades;
	}

	public void setModalidades(List<Modalidade> modalidades) {
		this.modalidades = modalidades;
	}
} 
