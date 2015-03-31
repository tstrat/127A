/*
	Travis Stratton
	Partner: Joy Chen
	Sec Leader: Andrew Emmott
	Date: Sept 9, 2010
	Class: CSc 127, sec 10
	Description:
		Calculates the Gravitational force between two objects,
		given their distance apart and each body's mass.
*/

import java.util.Scanner;

public class Gravity 
{
	public static void main(String args[])
	{
		int bod1, bod2, distance;
		float gravForce, gravity;
		
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter the mass of body one: ");
		bod1 = userInput.nextInt();
		System.out.print("Enter the mass of body two: ");
		bod2 = userInput.nextInt();
		System.out.print("Enter the distance between bodies: ");
		distance = userInput.nextInt();
		
		gravForce = 6.6726E-11f;
		gravity = (gravForce*bod1*bod2)/(distance*distance);
		System.out.println("The gravitational force is "+gravity+" newtons");
		
	}
}