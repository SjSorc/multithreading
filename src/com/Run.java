package com;

public class Run {
	public static void main(String[] args) {
		
		Runnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		
		Runnable r1 = new MyRunnable();
		Thread t1 = new Thread(r1);
		t1.start();
		
		try {
			t.join();
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main thread ends here");
	}
}
