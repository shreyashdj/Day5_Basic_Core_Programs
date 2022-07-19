package com.bridgelabz.day5BasicPrograms;

import java.util.Scanner;		// import Scanner class

public class FlipCoin {
	
	public static void main(String[] args) {
	
			Scanner scan = new Scanner(System.in);		// created scan object
			
			int tailCount = 0;		// initialized tailCount
			
			System.out.print(" Enter number of times to flip the coin : ");
			int numOfCoinFlip = scan.nextInt();		// taking input for number of coin flip
			
			/*
			 *		using for loop till no. of coin flip and
			 *		generating random no. by random function.
			 *		applying if condition on coin and
			 *		count tail.
			 *		calculating percentages of tail & head
			 */
			
			for (int i=1 ; i<=numOfCoinFlip ; i++) {
				double coin = Math.random();
				
				if (coin<0.5) {
				tailCount +=1;
				}			
			}
			double tailPercent = (double) tailCount/numOfCoinFlip * 100;
			double headPercent =  (100 - tailPercent);
		
			System.out.println("\n Tail Percentage is : " + tailPercent);
			System.out.println(" Head Percentage is : " + headPercent);
	
scan.close();
	}
}
