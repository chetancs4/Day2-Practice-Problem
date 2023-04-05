package com.Day2PracticeProblem;

import java.util.Scanner;

public class For_Q2_RevNum {

	public static void main(String[] args) {
		myMethod();
		
	}

	private static void myMethod() {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a no: ");
		int num = sc.nextInt();
		int rev=0;
		for( ; num != 0; num=num/10) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			
		}
		System.out.println("The Reverse No is: " +rev);
	}

}
