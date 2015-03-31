/*
  	Travis Stratton
   Your section leader: Andrew Emmott
   Your section 10
   Assignment 7 - Problem 1, CSc 127A, 
	Date:  10/20/2010
   Description: Takes a character, and a length from user.
	then prints the character in a square box of Length by length.
*/

import java.util.Scanner;

public class Boxes {

	public static void main (String[] args) {
		Scanner user = new Scanner(System.in);
		char c = ' '; // character from user
		int n = 0;    // length
		int i;        // to make for loop condition   
		
		System.out.print("Enter a character: ");
		c = user.next().charAt(0);
		System.out.print("Enter the size of the box: ");
		n = user.nextInt();
		String str = "";
		
		for (i = 0; i < n; i++) {
			str += c;	
		}
		
		for (i = 0; i <n; i++) {
			System.out.println(str);
		}
	}
}
