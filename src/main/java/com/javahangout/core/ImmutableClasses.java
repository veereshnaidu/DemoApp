package com.javahangout.core;

public class ImmutableClasses {

	public static void main(String[] args) {

		String name = new String(" Veeresh ");
		System.out.println("1. String instance HashCode : " + name.hashCode() + name);
		name = name.trim();
		System.out.println("1.1 String instance HashCode: " + name.hashCode() + name);
		name = name.concat(" Naidu ");
		System.out.println("2. String instance HashCode : " + name.hashCode() + name);

		App app = new App();
		System.out.println("1. Id : " + app.getId());
		System.out.println("app hash code " + app.hashCode());
		app.setId(100);
		System.out.println("2. Id : " + app.getId());
		System.out.println("app hash code " + app.hashCode());
		
	}

}
