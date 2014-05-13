package com.javabasico;

import static java.lang.System.out;

import java.util.Collections;
import java.util.List;

/**
 * Esta thread ordena a List<Number> para que outras Threads possam
 * fazer uma pesquisa binaria.
 * 
 * @author eduardo
 *
 */
public class SortThread extends Thread {
	
	private List<Integer> list;
	private PopulatorThread populatorThread;
	
	public SortThread(List<Integer> list, PopulatorThread populatorThread) {
		this.list = list;
		this.populatorThread = populatorThread;
	}

	public void run() {
		try {
			populatorThread.join();
			
			out.println(getClass().getName() + " started");
			
			out.print("Iniciando ordenacao dos dados...");
			Collections.sort(list); 
			
			out.println(" - ok " + getClass().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
