/**
 * 
 */
package com.javahangout.thread;

/**
 * @author Veeresh N
 *
 */
public class MyThread extends Thread {

	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		for(int i=0; i<10;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
	

}
