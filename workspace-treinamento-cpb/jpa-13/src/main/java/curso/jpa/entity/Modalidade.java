package curso.jpa.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@Entity
@Table(
	schema="cpb_treinamento",
	name="MODALIDADE"
)
public class Modalidade implements Serializable {

	private static final long serialVersionUID = 9123278328750705288L;

    public static final String ATLETISMO = "ATLETISMO";
    public static final String NATACAO = "NATAÇÃO";

    @Id
	@Column(name="ID_MODALIDADE", nullable=false)
    private Long id;

	@Column(name="NOME", nullable=false, length=45)
    private String nome;
	
    @Column(name="NOME_INGLES", nullable=true, length=45)
    private String nomeIngles;
	
	@ManyToMany(mappedBy="modalidades", fetch=FetchType.LAZY)
	private List<Evento> eventos = new ArrayList<Evento>();

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

	public String getNomeIngles() {
		return nomeIngles;
	}

	public void setNomeIngles(String nomeIngles) {
		this.nomeIngles = nomeIngles;
	}

	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}
}
