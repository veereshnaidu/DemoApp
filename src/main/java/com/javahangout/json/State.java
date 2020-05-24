package com.javahangout.json;

import java.io.Serializable;

public class State implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String capCity;
	private int numOfDist;
	private int numOfAdmDiv;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapCity() {
		return capCity;
	}
	public void setCapCity(String capCity) {
		this.capCity = capCity;
	}
	public int getNumOfDist() {
		return numOfDist;
	}
	public void setNumOfDist(int numOfDist) {
		this.numOfDist = numOfDist;
	}
	public int getNumOfAdmDiv() {
		return numOfAdmDiv;
	}
	public void setNumOfAdmDiv(int numOfAdmDiv) {
		this.numOfAdmDiv = numOfAdmDiv;
	}
	@Override
	public String toString() {
		return "State [name=" + name + ", capCity=" + capCity + ", numOfDist=" + numOfDist + ", numOfAdmDiv="
				+ numOfAdmDiv + "]";
	}
	
	
	
	
	

}
