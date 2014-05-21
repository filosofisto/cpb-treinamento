package curso.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TB002_FUNCIONARIO")
public class Funcionario extends Pessoa {

	@Column(name="SALARIO")
	private Double salario;

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
}
