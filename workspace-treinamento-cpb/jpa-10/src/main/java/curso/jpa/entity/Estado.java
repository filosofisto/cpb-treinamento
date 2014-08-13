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
@Table(schema="cpb_treinamento", name="ESTADO")
/*@NamedQueries({
	@NamedQuery(
			name="Estado.Todos",
			query="select e from Estado e order by e.nome"
	),
	@NamedQuery(
			name="Estado.ListaPorPais",
			query="select e from Estado e where e.pais.id=:idPais order by e.nome"
	)
})*/
public class Estado implements Serializable {

	private static final long serialVersionUID = -6345263272295683463L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_ESTADO", nullable=false)
    private Long id;

    @Column(name="NOME", nullable=false, length=45)
    private String nome;
	
	@ManyToOne
	@JoinColumn(name = "ID_REGIONAL")
	private Regional regional;
	
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

	public Regional getRegional() {
		return regional;
	}

	public void setRegional(Regional regional) {
		this.regional = regional;
	}
	
	/*@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		if (getId() == null) {
			return false;
		}
		if (obj instanceof Estado) {
			Estado estado = (Estado) obj;
			
			return getId().equals(estado.getId());
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return getId() != null 
				? getId().hashCode() 
				: getNome() != null
					? getNome().hashCode()
					: super.hashCode();
	}*/
}
