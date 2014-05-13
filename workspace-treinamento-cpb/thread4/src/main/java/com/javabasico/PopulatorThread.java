package com.javabasico;

import static java.lang.System.out;

import java.util.List;
import java.util.Random;

public class PopulatorThread extends Thread {
	
	private List<Integer> list;
	
	public PopulatorThread(List<Integer> list) {
		this.list = list;
	}

	public void run() {
		out.println(getClass().getName() + " started");
		
		Random rnd = new Random();
		int value;
		for (int i = 0; i < 100; i++) {
			value = rnd.nextInt(1000);
			list.add(value);
			out.printf("\tAdicionado item %d\n", value);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		out.println(getClass().getName() + " - ok");
	}
}
