/*
	Name: Travis Stratton
	Section Leader Name: Andrew Emmott
	Date: Sept 24, 2010
	Class: C Sc 127A Section 10
	Description:a program that takes in an int for the speed caught by the
	police radar and either yes or no for whether it is your birthday.
	From these it determines if the officer should give you a ticket.
*/

import java.util.Scanner;

public class CaughtSpeeding {

	public static void main(String args[]) {
		
		int speed;
		String yesNo;
		
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
	
		System.out.print("Please enter the recorded speed: ");
		speed = input.nextInt();  // This is the user's speed
		
		System.out.print("Is it your birthday?(y/n): ");
		yesNo = input2.nextLine(); // This holds the Sting value of a yes or no answer.
		
		String bDay = yesNo.toLowerCase();  //  sets string to lowercase for if statements.
		
		
		
		if (bDay.charAt(0) == 'n'){  // "if" statements if its not their b-day
			
			if (speed < 0) {
				System.out.println("You are driving backwords you CRAZY PERSON!!!");
			}
			else if (speed <= 60) {
				System.out.println("No ticket");
			}
			else if (speed <=80) {
				System.out.println("Small ticket");
			}
			else if (speed >80){
				System.out.println("Big ticket");
			}
		}
		
		
		
		if (bDay.charAt(0) == 'y'){  // "if" statements if it IS their b-day.
			
			if (speed < 0) {
				System.out.println("I dont care if its you're birthday!"+
										 " You are DRIVING BACKWARDS!!!!!");
			}
			else if (speed <= 65) {
				System.out.println("No ticket");
			}
			else if (speed <=85) {
				System.out.println("Small ticket");
			}
			else if (speed >85){
				System.out.println("Big ticket");
			}
		}
	
	}
	
}