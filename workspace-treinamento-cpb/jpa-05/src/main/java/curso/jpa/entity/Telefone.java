package curso.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TELEFONE")
public class Telefone {

	@Id 
	@GeneratedValue
	@Column(name="ID")
	private Long id;
	
	@Column(name="PAIS")
	private Integer pais;
	
	@Column(name="AREA", nullable=false)
	private Integer area;
	
	@Column(name="TELEFONE", nullable=false)
	private Long telefone;

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
	
	@Override
	public String toString() {
		return getPais() + " " + getArea() + " " + getTelefone();
	}
}
