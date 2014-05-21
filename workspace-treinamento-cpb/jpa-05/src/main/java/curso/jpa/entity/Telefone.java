package curso.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TB003_TELEFONE")
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
	
	@ManyToOne
	@JoinColumn(name="ID_PESSOA", nullable=false)
	private Pessoa pessoa;
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

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
