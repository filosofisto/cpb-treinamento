package com.javabasico.framework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListActionLoader {

	public List<Action> load(File file) 
		throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		Scanner scanner = new Scanner(file).useDelimiter("\r\n");
		List<Action> list = new ArrayList<Action>();
		String className;
		
		while (scanner.hasNext()) {
			className = scanner.next();
			
			Class cls = Class.forName(className);
			Action action = (Action) cls.newInstance();
			
			list.add(action);
		}
		
		return list;
	}
}
