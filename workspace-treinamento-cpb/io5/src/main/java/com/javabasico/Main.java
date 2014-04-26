package com.javabasico;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		try {
			File file = new File("/home/filosofisto/CPB/cpb-treinamento/workspace-treinamento-cpb/io5/project.obj");
			
			if (!file.exists()) {
				persistProject(file);
			}
			
			Projeto p = loadProject(file);
			
			System.out.println(p);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void persistProject(File file) throws IOException,
			FileNotFoundException {
		Projeto p = construirProjeto();
		
		ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream(file));
		out.writeObject(p);
		out.close();
	}

	private static Projeto construirProjeto() {
		Projeto p = new Projeto();
		
		Pessoa gerente = new Pessoa();
		gerente.setNome("Bill Gates");
		p.setGerente(gerente);
		
		Equipe equipe = new Equipe();
		Pessoa m1 = new Pessoa();
		m1.setNome("Eduardo");
		equipe.getMembros().add(m1);
		Pessoa m2 = new Pessoa();
		m2.setNome("Renato");
		equipe.getMembros().add(m2);
		Pessoa m3 = new Pessoa();
		m3.setNome("Filipe");
		equipe.getMembros().add(m3);
		Pessoa m4 = new Pessoa();
		m4.setNome("Rubens");
		equipe.getMembros().add(m4);
		Pessoa m5 = new Pessoa();
		m5.setNome("Rodrigo");
		equipe.getMembros().add(m5);

		//p.setEquipe(equipe);
		
		Tarefa t1 = new Tarefa();
		t1.setId(1);
		t1.setDescricao("Analise de Requisito");
		p.getTarefas().add(t1);
		Tarefa t2 = new Tarefa();
		t2.setId(2);
		t2.setDescricao("Projeto");
		p.getTarefas().add(t2);
		
		return p;
	}

	private static Projeto loadProject(File file) throws IOException, ClassNotFoundException {
		ObjectInputStream in = new ObjectInputStream(
				new FileInputStream(file));
		Projeto ret = (Projeto) in.readObject();
		in.close();
		
		return ret;
	}
}
