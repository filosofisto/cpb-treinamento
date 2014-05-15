package curso.jpa.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="PESSOA")
public class Pessoa {

	@Id 
	@GeneratedValue
	@Column(name="ID")
	private Long id;
	
	@Column(name="NOME", nullable=false)
	private String nome;
	
	@OneToMany(fetch=FetchType.LAZY, orphanRemoval=true, cascade={CascadeType.ALL})
	private List<Telefone> telefones;
	
	@OneToOne(fetch=FetchType.LAZY, orphanRemoval=true, cascade={CascadeType.ALL})
	@JoinColumn(name="ENDERECO_ID")
	private Endereco endereco;

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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
}
