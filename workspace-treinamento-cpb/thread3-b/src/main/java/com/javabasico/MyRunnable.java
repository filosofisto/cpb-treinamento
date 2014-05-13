package com.javabasico;

import static java.lang.System.out;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			out.printf("valor do i=%d\n", i);
			//Thread.yield();
		}
	}
}
