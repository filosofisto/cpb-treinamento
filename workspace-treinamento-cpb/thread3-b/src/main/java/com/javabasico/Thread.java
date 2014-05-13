package com.javabasico;

public class Thread {

	private Runnable runnable;
	
	public Thread() {
		
	}
	
	public Thread(Runnable runnable) {
		this.runnable = runnable;
	}
	
	public void run() {
		if (runnable != null) {
			runnable.run();
		}
	}
}
