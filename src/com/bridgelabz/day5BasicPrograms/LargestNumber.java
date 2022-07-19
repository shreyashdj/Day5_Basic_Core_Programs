package com.bridgelabz.day5BasicPrograms;

import java.util.Scanner;		// import Scanner class

public class LargestNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		// created scan object
		
		/*
		 *		taking input of three numbers
		 */
		
		System.out.print("enter num1 : ");
		int num1 = scan.nextInt();
		
		System.out.print("enter num2 : ");
		int num2 = scan.nextInt();
		
		System.out.print("enter num3 : ");
		int num3 = scan.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("Largest number is " +num1);
		}	
		else if (num2 > num3) {
	   		System.out.println("Largest number is " +num2);
		}
		 else 
		   	System.out.println("Largest number is " +num3);
	
scan.close();
	}
}
