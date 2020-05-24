/**
 * 
 */
package com.javahangout.core;

/**
 * @author Veeresh N
 *
 */
public class ImmutableClassTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ImmutableEmp emp = new ImmutableEmp(1001, "Veeresh");
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		

	}

}
