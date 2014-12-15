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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "EVENTOS")
public class Evento implements Serializable {

	private static final long serialVersionUID = 1891027876136434217L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_EVENTO", nullable=false)
    private Long id;

    @Column(name="NOME", nullable=false, length=45)
    private String nome;
    
    //@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, orphanRemoval=true)
    /*@JoinTable(
		name="EVENTO_MATERIAL", 
		joinColumns=@JoinColumn(name="ID_EVENTO"), 
		inverseJoinColumns=@JoinColumn(name="ID_MATERIAL")
	)*/
    /*@ManyToMany(
		fetch=FetchType.LAZY, 
		cascade={CascadeType.ALL}
	)
	@JoinTable(
		name="EVENTO_MATERIAL", 
		joinColumns=@JoinColumn(name="ID_EVENTO"), 
		inverseJoinColumns=@JoinColumn(name="ID_MATERIAL")
	)*/
    @OneToMany(cascade=CascadeType.ALL, mappedBy="evento", orphanRemoval=true)
    private List<Material> materiais = new ArrayList<Material>();

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

	public List<Material> getMateriais() {
		return materiais;
	}

	public void setMateriais(List<Material> materiais) {
		this.materiais = materiais;
	}
}
