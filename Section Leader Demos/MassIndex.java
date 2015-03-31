/*
	Travis Stratton
	Sec Leader: Andrew Emmott
	Sept. 22, 2010
	Assignment 4 - Problem #1
	CSc 127A, section 10
	Description:
		This Program takes the user input of Name, Weight and Height
		and calculates/converts the numbers into the metric units and
		reprints them.
	
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class MassIndex
{
	public static void main(String []args)
	{
	int height;
	double massIndex, weight;
	String name;
	Scanner userInput= new Scanner(System.in);
	
	System.out.print("Enter the name: ");
	name = userInput.nextLine();
	System.out.print("Enter the weight in pounds: ");
	weight = userInput.nextDouble();
	System.out.print("Enter the height in inches: ");
	height = userInput.nextInt();
	
	int feet, inches;
	feet = (height/12);
	inches = height%12;
	double meters = height/39.37;
	double kilograms;
	kilograms = weight/2.205;
	
	massIndex = kilograms/((double)meters*meters);
	
	DecimalFormat meter2, kilo, pounds, index;
	meter2 = new DecimalFormat("#.00");
	pounds = new DecimalFormat("#.000");
	kilo = new DecimalFormat("#.000");
	index = new DecimalFormat("#.00");
	
	System.out.println(name + ":");
	System.out.println("height: "+feet+" feet "+inches+" inches" );
	System.out.println("height: "+meter2.format(meters)+" meters" );
	System.out.println("\nweight: "+pounds.format(weight)+" pounds");
	System.out.println("weight: "+kilo.format(kilograms)+" kilograms");
	System.out.println("Body Mass Index: "+index.format(massIndex));
	}
}