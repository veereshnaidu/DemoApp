package com.javahangout.json;

public class MyThreadTest {
	public static void main(String[] args) {
		System.out.println("Thread started...");
		MyThread mt = new MyThread();
		mt.start();
		
		Thread mr = new Thread(new MyRunnable());
		mr.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}

}
