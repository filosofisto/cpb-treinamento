package curso.jpa.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="TB001_PESSOA")
public class Pessoa {

	@Id 
	@GeneratedValue
	@Column(name="ID_PESSOA")
	private Long id;
	
	@Column(name="NOME", nullable=false)
	private String nome;
	
	@ManyToMany(
			fetch=FetchType.LAZY, 
			cascade={CascadeType.ALL}
	)
	@JoinTable(
		name="TB003_PESSOA_TELEFONE", 
		joinColumns=@JoinColumn(name="ID_PESSOA"), 
		inverseJoinColumns=@JoinColumn(name="ID_TELEFONE")
	)
	private List<Telefone> telefones = new ArrayList<Telefone>();
	
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

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
}
