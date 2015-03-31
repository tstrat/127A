/*
	Name: Travis Stratton
	Section Leader Name: Andrew Emmott
	Date: Sept 24, 2010
	Class: C Sc 127A Section 10
	Description:Reads in a number between 0 and 100 (inclusive),
	and has the program print the corresponding letter grade.
*/

import java.util.Scanner;

public class LetterGrade 
{
	
	public static void main(String args[]) {
	
   	Scanner input = new Scanner(System.in);
		int number;
		System.out.print("Please enter a number: ");
		number = input.nextInt();
		
		String grade;
		
		if (number < 0 || number >100){
			System.out.print("The number "+number+" is not valid."+
								 "Only integers between 0 and 100 are valid.");		
		}
		else if (number <=59) {
			grade = "F";
			System.out.print(number+" is a "+grade);
		}
		else if (number <=69) {
			grade = "D";
			System.out.print(number+" is a "+grade);
		}
		else if (number <=79) {
			grade = "C";
			System.out.print(number+" is a "+grade);
		}
		else if (number <=91) {
			grade = "B";
			System.out.print(number+" is a "+grade);
		}
		else if (number <=100) {
			grade = "A";
			System.out.print(number+" is a "+grade);
		}
			
	}

}