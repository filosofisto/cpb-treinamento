package com.javabasico;

import static java.lang.System.out;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			out.printf("id: %d, valor do i=%d\n", Thread.currentThread().getId(), i);
			//Thread.yield();
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
