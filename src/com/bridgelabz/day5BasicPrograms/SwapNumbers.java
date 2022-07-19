package com.bridgelabz.day5BasicPrograms;

import java.util.Scanner;		// import Scanner class

public class SwapNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		// created scan object
		
		System.out.println("enter two numbers");
		int num1 = scan.nextInt();			// taking input for num1
		int num2 = scan.nextInt();			// taking input for n2
		
		System.out.println("Before Swapping the value of num1 is : "+num1+" and num2 is : "+num2);
		
		/*
		 * 		store value of num1 in temporary
		 * 		store value of num2 in  num1
		 * 		store value of temporary in num2
		 * 		print num1 & num2
		 */
		
	int temporary = num1;
		num1 = num2;
		num2 = temporary;
		
		System.out.println("After Swapping the value of num1 is : "+num1+" and num2 is : "+num2);
	
scan.close();
	}

}
