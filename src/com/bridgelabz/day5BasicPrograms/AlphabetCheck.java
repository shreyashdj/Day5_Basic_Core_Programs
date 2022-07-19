package com.bridgelabz.day5BasicPrograms;

import java.util.Scanner;		// import Scanner class

public class AlphabetCheck {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		// created scan object
		
		System.out.print("Enter alphabet : ");
		char alphabet = scan.next().charAt(0);			// taking input of alphabet
		
		switch (alphabet) {
		
		case 'a':	case 'A':
		case 'e':	case 'E':
		case 'i':	case 'I':
		case 'o':	case 'O':
		case 'u':	case 'U':	
			
			System.out.println(alphabet +" is vowel");
		break;
		
		default :
			System.out.println(alphabet +" is consonant");
		}
		
scan.close();		
	}

}
