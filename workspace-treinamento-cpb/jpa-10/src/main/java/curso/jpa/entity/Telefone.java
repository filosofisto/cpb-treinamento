package curso.jpa.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="TB002_TELEFONE")
public class Telefone {

	@Id 
	@GeneratedValue
	@Column(name="ID_TELEFONE")
	private Long id;
	
	@Column(name="PAIS")
	private Integer pais;
	
	@Column(name="AREA", nullable=false)
	private Integer area;
	
	@Column(name="TELEFONE", nullable=false)
	private Long telefone;
	
	@ManyToMany(mappedBy="telefones", fetch=FetchType.LAZY)
	/*@JoinTable(
		name = "TB003_PESSOA_TELEFONE", 
		joinColumns = @JoinColumn(name="ID_PESSOA"), 
		inverseJoinColumns=@JoinColumn(name="ID_TELEFONE")
	)*/
	private List<Pessoa> pessoas;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getPais() {
		return pais;
	}

	public void setPais(Integer pais) {
		this.pais = pais;
	}

	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}
	
	/*public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}*/

	@Override
	public String toString() {
		return getPais() + " " + getArea() + " " + getTelefone();
	}
}
