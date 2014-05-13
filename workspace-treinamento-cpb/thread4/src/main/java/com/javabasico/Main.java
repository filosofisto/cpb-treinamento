package com.javabasico;

import java.util.ArrayList;
import java.util.List;


/**
 * Sincronizando Threads com join.
 */
public class Main {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		PopulatorThread populatorThread = new PopulatorThread(list);
		SortThread sortThread = new SortThread(list, populatorThread);
		SearchThread search = new SearchThread(list, sortThread);
		
		search.start();
		sortThread.start();
		populatorThread.start();
	}
}
