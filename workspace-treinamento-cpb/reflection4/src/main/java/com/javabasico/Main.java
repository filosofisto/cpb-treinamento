package com.javabasico;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		
		p.setIdade(66);
		p.setNome("Maradona");
		
		Pessoa airton = new Pessoa();
		
		airton.setIdade(40);
		airton.setNome("Senna");
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(p);
		pessoas.add(airton);
		
		ExportadorXML exportadorXML = new ExportadorXML();
		
		try {
			String xml = exportadorXML.exportar(pessoas, "pessoas");
			System.out.println(xml);
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
			e.printStackTrace();
		}
		
	}
}
