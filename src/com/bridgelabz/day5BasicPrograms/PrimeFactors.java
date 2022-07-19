package com.bridgelabz.day5BasicPrograms;

import java.util.Scanner;		// import Scanner class

public class PrimeFactors {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		// created scan object
		
		System.out.print("Enter a Number : ");
		int num = scan.nextInt();			// taking input of number
		
		System.out.println("Prime Factors of "+num+" are");
		for (int i=2; i*i<=num; i++ ) {
			
			while(num % i==0) {
				System.out.print(i +"  ");
				num = num/i;
			}			
		}
		
scan.close();
		}
}