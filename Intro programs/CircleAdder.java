/*
   Travis Stratton
   section leader: Andrew Emmott
   Date: 10/22/2010
   CSc 127A, Fall 2010
   Description: This program reads the radius of 2 circles, then
	calculates the circumfrence&Area of each, and then prints
	the combined values of the circumfrence and areas. 
*/

import java.util.Scanner;

public class CircleAdder {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		double r1, r2;
		
		System.out.print("Enter the radius of the first circle: ");
		r1 = user.nextDouble();
		System.out.print("Enter the radius of the second circle: ");
		r2 = user.nextDouble();
		
		System.out.println("First circle circumfrence = " + circumfrence(r1)+" and area = " + area(r1) );
		System.out.println("Second circle circumfrence = " + circumfrence(r2)+" and area = " + area(r2) );
		
		System.out.println("Combined circumfrence = " + (circumfrence(r1)+circumfrence(r2)) );
		System.out.println("Combined area = " + (area(r1)+area(r2)) );
	}
	
	public static double circumfrence(double r) {
		return 2*(Math.PI)*r;
	}
	
	public static double area(double r) {
		return (Math.PI)*Math.pow(r, 2);
	}

}