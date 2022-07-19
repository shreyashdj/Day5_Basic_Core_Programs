package com.bridgelabz.day5BasicPrograms;

import java.util.Scanner;		// import Scanner class

public class LeapYear {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		// created scan object
		
		System.out.print("Enter year : ");
		int	year = scan.nextInt();		// taking input of year
		
		/*
		 * 		applying if-else condition to check year is leap or not
		 */
		
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(+year +" is Leap Year");		
		} else {
			System.out.println(+year +" is Not Leap Year");
		}

scan.close();
		
	}

}
