/*
	Name: Travis Stratton
	Section Leader Name: Andrew Emmott
	Date: Oct 8, 2010
	Class: C Sc 127A Section 10
	Description:
		Takes in a base word, and then reads in words
		from the user unto the word "Stop" is given by 
		the user.  For each word it prints whether or 
		not the words are equal.
*/

import java.util.Scanner;

public class WordComparison {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		
		String baseStr = "";
		String compareStr = "";
		
		System.out.print("Please enter a base string: ");
		baseStr = user.nextLine();
		System.out.print("Enter the word to compare: ");
		compareStr = user.nextLine();
		
		while (!(compareStr.equals("STOP")) ){
			System.out.println("Word equals base: "+baseStr.equals(compareStr));
			System.out.println("Word equals base, ignoring case: "+baseStr.equalsIgnoreCase(compareStr));
			System.out.print("Enter the word to compare: ");
			compareStr = user.nextLine();
		}
			
	}
}