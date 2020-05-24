package com.javahangout.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StringUtility {

	private static String states = "AP,AR,AN,AS,BR,CH,CT,DN,DD,DL,GA,GJ,HR,HP,JK,JH,KA,KL,LD,MP,MH,MN,ML,MZ,NL,OR,PY,PB,RJ,SK,TN,TG,TR,UP,UT,WB";
	private static String regex = ",";

	private static Map<String, String> map = new HashMap<>();
	static {
		map.put("AP", "Andhra Pradesh");
		map.put("KA", "Karnataka");
		map.put("AR", "Arunachal Pradesh");
		map.put("BR", "Bihar");
		map.put("DL", "Delhi");
		map.put("GJ", "Gujarat");
		map.put("HR", "Haryana");
		map.put("KL", "Kerala");
		map.put("WB", "West Bengal");
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter state's Abbreviation");
		String input = sc.nextLine();
		sc.close();
		System.out.println("state's Abbreviation " + input);

		List<String> list = stringToList(states, regex);

		if (list.contains(input)) {
			System.out.println("State Name : " + map.get(input));
		}

	}

	private static List<String> stringToList(String states, String regex) {
		return Arrays.asList(states.split(regex));

	}
}