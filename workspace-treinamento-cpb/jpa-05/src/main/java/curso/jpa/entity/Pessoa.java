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
@Table(name="TB001_PESSOA")
public class Pessoa {

	@Id 
	@GeneratedValue
	@Column(name="ID_PESSOA")
	private Long id;
	
	@Column(name="NOME", nullable=false)
	private String nome;
	
	@OneToMany(targetEntity=Telefone.class, cascade=CascadeType.ALL, mappedBy="pessoa")
	private List<Telefone> telefones;
	
	@OneToOne(fetch=FetchType.LAZY, orphanRemoval=true, cascade={CascadeType.ALL})
	@JoinColumn(name="ID_ENDERECO")
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
