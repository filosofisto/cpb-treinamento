package com.javabasico;

import java.io.File;
import java.util.List;

import com.javabasico.framework.Action;
import com.javabasico.framework.ListActionExecuter;
import com.javabasico.framework.ListActionLoader;

public class Main {

	public static void main(String[] args) {
		try {
			//String config = "G:/eduardo/project_history/treinamentos/instituicoes/x25/2011/logica e programacao Java6/workspace-marco-abril/reflection-use-framework/src/actions.config";
			String config = "/home/filosofisto/CPB/cpb-treinamento/workspace-treinamento-cpb/reflection-use-framework/src/main/resources/actions.config";
			ListActionLoader loader = new ListActionLoader();
			List<Action> list = loader.load(new File(config));
			
			ListActionExecuter executer = new ListActionExecuter();
			executer.execute(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
