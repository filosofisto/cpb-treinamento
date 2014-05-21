package curso.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="TB001_PESSOA")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Pessoa {

	@Id 
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="ID_PESSOA")
	private Long id;
	
	@Column(name="NOME", nullable=false)
	private String nome;
	
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
}
