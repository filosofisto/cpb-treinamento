package com.javabasico;

import java.util.List;
import java.util.Random;

import static java.lang.System.*;

public class SearchThread extends Thread {

	private List<Integer> list;
	private SortThread sortThread;
	
	public SearchThread(List<Integer> list, SortThread sortThread) {
		this.list = list;
		this.sortThread = sortThread;
	}
	
	public void run() {
		try {
			sortThread.join();
			
			out.println(getClass().getName() + " started");
			
			Random random = new Random();
			Integer x = random.nextInt(1000);
			Integer item;
			for (int i = 0; i < list.size(); i++) {
				item = list.get(i);
				out.printf("\tPesquisando...valor atual: %d\n", item);
				if (list.get(i).equals(x)) {
					out.printf("Achei na posicao %d", i);
					break;
				}
			}
			
			out.println(getClass().getName() + " - ok");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
