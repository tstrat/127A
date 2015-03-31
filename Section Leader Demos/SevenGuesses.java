/*
  	Travis Stratton
   Your section leader: Andrew Emmott
   Your section 10
   Assignment 7 - Problem 1, CSc 127A, 
	Date:  10/20/2010
   Description: Generates a random number
	then lets the user guess 7 times to see if
	they can get the number.
*/

import java.util.Scanner;
import java.util.Random;

public class SevenGuesses {

	public static void main(String[] args) {
		
		Scanner user = new Scanner(System.in);
		int num, guess, numTimes = 0;
		Random rand = new Random();
		num = rand.nextInt(101);
		
		//System.out.println("The random Number is "+num);  //<-- used to check work.
		
		do {
			System.out.print("Please enter a number: ");
			guess = user.nextInt();
			if (guess < num){
				System.out.println("That's too low!");
				numTimes++;
			}
			if (guess > num){
				System.out.println("That's too high!");
				numTimes++;
			}
			if (guess == num){
				System.out.println("That's right!");
				numTimes = 9;
			}
			
		} while (numTimes <7);
		
		if (numTimes == 7 ){
			System.out.println("Too bad! The number was "+num);
		}
	
	}
}