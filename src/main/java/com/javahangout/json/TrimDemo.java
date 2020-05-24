/**
 * 
 */
package com.javahangout.json;

/**
 * @author Veeresh N
 *
 */
public class TrimDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {  
        String s1 ="  java hangout channel  ";  
        System.out.println(s1); //Without trim()
        System.out.println(s1.length());  
        String tr = s1.trim();
        System.out.println(tr); //With trim()
        System.out.println(tr.length());  
        
        String uname = "testuser ";
        uname = uname.trim();
        if("testuser".equalsIgnoreCase(uname)){
        	System.out.println("true....");
        	
        }else{
        	System.out.println("false...");
        }
    }  
}
