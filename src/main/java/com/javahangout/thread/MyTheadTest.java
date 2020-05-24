/**
 * 
 */
package com.javahangout.thread;

/**
 * @author Veeresh N
 *
 */
public class MyTheadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
		mt.start();
		
		Thread mr = new Thread(new MyRunnable());
		mr.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
		
	}

}
