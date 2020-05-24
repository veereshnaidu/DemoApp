/**
 * 
 */
package com.javahangout.json;

/**
 * @author Veeresh N
 *
 */
public class MyRunnable implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}

	}

}
