package curso.jpa.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TB001_CONSULTOR")
public class Consultor {

	@Id 
	@GeneratedValue
	@Column(name="ID_CONSULTOR")
	private Long id;
	
	@Column(name="NOME", nullable=false)
	private String nome;
	
	@OneToMany
	@JoinColumn(name="ID_CONSULTOR")
	private List<Consultoria> consultorias = new ArrayList<Consultoria>();
	
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

	public List<Consultoria> getConsultorias() {
		return consultorias;
	}

	public void setConsultorias(List<Consultoria> consultorias) {
		this.consultorias = consultorias;
	}
}
