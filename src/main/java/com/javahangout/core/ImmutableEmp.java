package com.javahangout.core;

public final class ImmutableEmp {

	private final int id;
	private final String name;

	public ImmutableEmp(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	

}
