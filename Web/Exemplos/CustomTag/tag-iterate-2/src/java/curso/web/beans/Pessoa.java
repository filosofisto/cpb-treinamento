/*
 * Created on 12/03/2006
 *
 */
package curso.web.beans;

/**
 * @author hp
 *
 */
public class Pessoa {

	private String nome;
	private int idade;
	
	/**
	 * @return Returns the idade.
	 */
	public int getIdade() {
		return idade;
	}
	
	/**
	 * @param idade The idade to set.
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	/**
	 * @return Returns the nome.
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * @param nome The nome to set.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
}
