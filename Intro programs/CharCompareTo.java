/*
	Name: Travis Stratton
	Section Leader Name: Andrew Emmott
	Date: Oct 8, 2010
	Class: C Sc 127A Section 10
	Description:
		The program compares 2 characters and displayes how far they are apart as a number value.
*/

import java.util.Scanner;

public class CharCompareTo {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		String one = "";
		String two = "";
		
		System.out.print("Please enter the first character: ");
		one = user.next();
		System.out.print("Please enter the first character: ");
		two = user.next();
		
		char ch1, ch2;
		ch1 = one.charAt(0);
		ch2 = two.charAt(0);
	
		int difference = ch1 - ch2;
		
		System.out.println("Character one compared to character two is "+difference);
	}
}