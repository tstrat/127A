/*
	Travis Stratton
	Partner:  Joy Chen
	Sec. Leader: Andrew Emmott
	Date: Sept. 10, 2010
	Class: CSc 127A Section 10
	Description:
		This program calculates the a total Grade Average
		for 3 classes
*/

import java.util.Scanner;

public class CalculateGPA
{
	public static void main(String args[])
	{
		int cred1, cred2, cred3, grd1, grd2, grd3;
		double gPA;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Please enter the first number of credits: ");
		cred1 = userInput.nextInt();
		System.out.print("Please enter the first grade: ");
		grd1 = userInput.nextInt();
		System.out.print("Please enter the second number of credits: ");
		cred2 = userInput.nextInt();
		System.out.print("Please enter the second grade: ");
		grd2 = userInput.nextInt();
		System.out.print("Please enter the third number of credits: ");
		cred3 = userInput.nextInt();
		System.out.print("Please enter the third grade: ");
		grd3 = userInput.nextInt();
		
		gPA = ((double)cred1*grd1 + cred2*grd2 + cred3*grd3)/(cred1+cred2+cred3);
		System.out.println("The GPA is: " + gPA);
		
		
	}
}