package com.javahangout.custom.exception;

import java.util.Scanner;

public class CustomExceptionTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*float withDrawAmt = sc.nextFloat();
		System.out.println("Amount is withDrawn : "+withDraw(withDrawAmt));*/
		
		int age = sc.nextInt();
		System.out.println(registerForPassionShow(age));
	}

	private static float withDraw(float withDrawAmt) {

		float balanceAmount = 10000;
		if (withDrawAmt > balanceAmount) {
			throw new InsufficientBalanceException("Your balance is insufficient. Please try with lesser amount");
		}
		return withDrawAmt;

	}
	
	private static String registerForPassionShow(int age){
		if(age<18){
			throw new TooEarlyException("Your age is less than 18.. Please try after complition of 18 years.");
		}
		return "Registration is Successful, See you in the show.";
		
	}

}
