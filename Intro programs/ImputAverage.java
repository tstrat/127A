/* 
	Travis Stratton
	Partner: Joy Chen (section 10)
	Sec Leader : Andrew Emmott
	Date: Sept 9/10/2010
	Class: CSc 127A section 10
	Description:
		This program takes 3 numbers given by the user and
		computes the average value of the three numbers.
	
*/ 

import java.util.Scanner;

public class ImputAverage
{
	public static void main(  String args[]  )
	{
		int num1, num2, num3;
		double average;
		
		Scanner scanInput;
		scanInput = new Scanner( System.in );
		
		System.out.print("Please enter the first number: ");
		num1 = scanInput.nextInt();
		System.out.print("Please enter the second number: ");
		num2 = scanInput.nextInt();
		System.out.print("Please enter the third number: ");
		num3 = scanInput.nextInt();
		average = (num1+num2+num3)/3.0;
		System.out.println(	"The average of "+num1+","+num2+
									" and "+num3+ " is "+average);
	}
}