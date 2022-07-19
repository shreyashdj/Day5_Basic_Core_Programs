package com.bridgelabz.day5BasicPrograms;

import java.util.Scanner;		// import Scanner class

public class HarmonicNumber {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);		// created scan object

			double	ans = 0;		// initialized ans & series
			
			System.out.print("Enter number of term : ");	
			int N = scan.nextInt();			// taking input for no. of term
			
			System.out.println("\n Harmonic Number Series");
			for (int i=1; i<=N; i++) {				
				ans = ans + (double) 1/i;
		
				if (i==1) {
					System.out.print(" 1");
				} else
					System.out.print(" + 1/"+i);
			}
			System.out.println("\n\n Sum of Harmonic Numbers is "+ans);

scan.close();	
	}

}
