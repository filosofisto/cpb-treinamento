/*
 * Pessoa.java
 *
 * Created on 6 de Mar�o de 2006, 12:59
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package curso.web.beans;

import java.io.Serializable;

/**
 *
 * @author hp
 */
public abstract class Pessoa implements Serializable {
    
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
