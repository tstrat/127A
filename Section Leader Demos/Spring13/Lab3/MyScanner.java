/*
		My Scanner
	Programmed by: Travis Stratton

	This program is a simple overview of the Scanner
Class.  It demonstrates how to properly import and use the
Scanner with the standard system input to record input into
variables and use them in java equations.

*/

// FIRST AND FOREMOST (Before anything else

// Import Scanner
import java.util.Scanner;
// End of imports.


public class MyScanner {

	//Main
	public static void main(String[] args)
	{
		// Create a new Scanner
		Scanner keyboard = new Scanner(System.in);

		// YOU ONLY NEED 1 SCANNER FOR EACH INPUT
		
		// Making some variables that I want to use later
		String myName;
		int myFavoriteNumber;
		int chanceProgramCompiles;
		
		// Prompt first:
		System.out.print("Hello! What is your name?" +
				   "\nPlease enter a name [A-Za-z]: ");
		myName = keyboard.nextLine();
		
		// output name back to user:
		System.out.println("Hi, " + myName + "!");
		
		System.out.println();
		System.out.print("What's your favorite number? (Enter a number): ");
		myFavoriteNumber = keyboard.nextInt();
		
		System.out.println("Oh WOW! " + myFavoriteNumber + "!! Mine too!!");
		System.out.println();
		System.out.println("What is the chance that this program compiles?");
		chanceProgramCompiles = keyboard.nextInt();

		System.out.println("That can be written as " + chanceProgramCompiles +"%, or as " + (chanceProgramCompiles / 100.0) );
				
	}// end of main

}// end of MyScanner
