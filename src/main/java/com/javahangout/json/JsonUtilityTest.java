package com.javahangout.json;

public class JsonUtilityTest {
	
	public static void main(String[] args) {
		State st = new State();
		st.setName("Karnataka");
		st.setCapCity("Bangalore");
		st.setNumOfDist(28);
		st.setNumOfAdmDiv(4);
		
//		System.out.println("Object : "+st);
		String jsonString = JsonUtility.toJsonString(st);
//		System.out.println("JsonString From Object : "+jsonString);
		
		System.out.println("\n");
		System.out.println("Json String : "+jsonString);
		State state = JsonUtility.toObject(jsonString, State.class);
		System.out.println("Object from JsonString : "+state);
	}

}
