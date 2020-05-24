package com.javahangout.core;

public class WrapperClassesDemo {
	
public static void main(String[] args) {
	
	//String to Integer
	String value = "10";
	Integer intRef = Integer.valueOf(value);
	System.out.println(intRef);
	//Integer to String
	String intRefToString = intRef.toString(); 
	
	//String to int primitive data type
	String value1 = "20";
	int intValue = Integer.parseInt(value1);	
	//int to String
	String intToString = String.valueOf(intValue);
	
	//Wrapper to primitive
	Integer ref = new Integer(30);
	int inValue = ref.intValue();
	
	//Primitive to Wrapper
	Integer intToRef = Integer.valueOf(inValue);
	Integer intToRef1 = new Integer(intToRef);
	
//	Autoboxing - Java Autoboxing is used to automatically convert 
//	the primitive data types into corresponding objects.
	int i = 10;//Primitive value
	Integer autoRef = i;
	
//	Unboxing -Java Unboxing is reverse of Autoboxing, i.e. it converts wrapper class object into 
//	its corresponding primitive data type.
	int unBoxing = autoRef;
	
	
	
}

}
