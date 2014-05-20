/*
 * Pessoa.java
 *
 * Created on 15 de Março de 2006, 17:00
 *
 */

package curso.jee.web.beans;

/**
 *
 * @author hp
 */
public class Pessoa {
    
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
