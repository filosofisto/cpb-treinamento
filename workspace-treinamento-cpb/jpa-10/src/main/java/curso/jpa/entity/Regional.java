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
@Table(schema="cpb_treinamento", name = "REGIONAL")
/*@NamedQueries({
	@NamedQuery(name="Regional.Todas", 
				query="select r from Regional r order by r.id")
})*/
public class Regional implements Serializable {

	private static final long serialVersionUID = -847477419807690617L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_REGIONAL", nullable=false, unique=true)
	private Long id;
	
	@Column(name = "NOME", nullable = false, length = 45)
	private String nome;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "regional", orphanRemoval = true)
	private List<Estado> estados = new ArrayList<Estado>();
	
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

	public List<Estado> getEstados() {
		return estados;
	}

	public void setEstados(List<Estado> estados) {
		this.estados = estados;
	}
}

