	/*
	Name: Travis Stratton
	Section Leader Name: Andrew Emmott
	Date: Sept 24, 2010
	Class: C Sc 127A Section 10
	Description: a program that reads in a radius from the user,
	then calculates the area and circumference of a circle.
*/
import java.util.Scanner;
import java.text.DecimalFormat;

public class CircleMath {
	public static void main(String args[]) {
	
		Scanner input = new Scanner(System.in);
		double radius;
		System.out.print("Please enter a radius: ");
		radius = input.nextDouble();
		
		double circumfrence = 2.0*Math.PI*radius;
		
		DecimalFormat newForm = new DecimalFormat("0.00000000");
		DecimalFormat newForm2 = new DecimalFormat("0.0000000000");
		double pi = (Math.PI);
		double area = pi*radius*radius;
		
		System.out.println("Circumfrence of a circle of radius "+radius+" is "
									+newForm.format(circumfrence));
		System.out.println("Area of a circle of radius "+radius+" is "
									+newForm2.format(area));
	}
}
