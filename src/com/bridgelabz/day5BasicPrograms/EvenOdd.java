package com.bridgelabz.day5BasicPrograms;

import java.util.Scanner;		// import Scanner class

public class EvenOdd {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		// created scan object
		
		System.out.print("Enter number : ");
		int num = scan.nextInt();			// taking input of number
		
		/*
		 * 		checking number is even or odd by using modulus
		 */
		
		if (num % 2 == 0) {
			System.out.println(num +" is Even number");
	  } else
			System.out.println(num +" is Odd number");	
	
scan.close();
	}

}
