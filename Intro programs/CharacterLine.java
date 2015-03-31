/*
	Name: Travis Stratton
	Section Leader Name: Andrew Emmott
	Date: Oct 8, 2010
	Class: C Sc 127A Section 10
	Description:
		This program takes a character from the user and prints it
		the number of times specified by the user (Given that the
		integer is [1, 80])
*/

import java.util.Scanner;

public class CharacterLine {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		
		System.out.print("Please enter a character: ");
		String str = user.next();
		char toRepeat = str.charAt(0);
		System.out.print("Please enter a number: ");
		int numTimes = user.nextInt();
		
		if (numTimes <1)	{
			System.out.println("That number is too small");
		}
		if (numTimes >80) {
			System.out.println("That number is too large.");
		}
		if (numTimes >= 1 && numTimes <= 80) {
			String output = "";
			System.out.println("Your line:");
			while (numTimes >0) {
				output = output + toRepeat;
				numTimes--;
			}
			
			System.out.println(output);
		}
	
	}
	
}