/**
 * 
 */
package com.javahangout.string;

/**
 * @author Veeresh N
 *
 */
public class TrimDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*String s1 = "  java hangout channel  ";
		System.out.println(s1);
		System.out.println(s1.length());
		
		String trimedString = s1.trim();
		System.out.println(trimedString);
		System.out.println(trimedString.length());*/
		
		String uname = " testuser ";
		uname = uname.trim();
		String configUname="testuser";
		if(configUname.equalsIgnoreCase(uname)){
			System.out.println("true...");
		}else{
			System.out.println("false....");
		}

	}

}
