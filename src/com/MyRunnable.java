package com;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		
		try {
			Thread.sleep(1000* 5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Running");
		
	}

}
