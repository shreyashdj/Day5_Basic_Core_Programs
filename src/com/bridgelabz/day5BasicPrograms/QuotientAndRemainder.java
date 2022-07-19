package com.bridgelabz.day5BasicPrograms;

import java.util.Scanner;		// import Scanner class

public class QuotientAndRemainder {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		// created scan object
		
		System.out.print("Enter Dividend : ");
		int dividend = scan.nextInt();			// taking input of dividend
		
		System.out.print("Enter Divisor : ");
		int divisor = scan.nextInt();			// taking input of divisor
		
		int quotient = dividend / divisor;		// calculating quotient
		int remainder = dividend % divisor;		// calculating remainder
		
		System.out.println("Quotient = " +quotient);
		System.out.println("Remainder = " +remainder);
	
scan.close();
	}

}
