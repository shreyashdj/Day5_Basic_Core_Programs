package com.bridgelabz.day5BasicPrograms;

import java.util.Scanner;		// import Scanner class

public class PowerOf2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		// created scan object
		
		System.out.print("Enter Power Of Two : ");
		int N = scan.nextInt();			// taking input for power of 2
		
		int ans = 1;		// initialized ans

		/*
		 * 		using for loop till power of 2 and
		 *		printing table of power of 2
		 */
		
		for (int i=0 ; i*i<=N ; i++) {
			System.out.println("2^" +i + " = " + ans);
			ans = ans*2;			
		}
		
scan.close();
	}

}
