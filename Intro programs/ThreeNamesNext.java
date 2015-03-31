/*
	Travis Stratton
	Section Leader: Andrew Emmott
	Date: Sept. 17, 2010
	CsC127A, Section 10
	Description:
	This program reads the in a person's first middle and last
	name and then formats them in three different ways.
	
*/

import java.util.Scanner;


public class ThreeNamesNext
{
	public static void main(String[] args)
	{
	String firstName, middle, lastName;
	Scanner names = new Scanner(System.in);
	
	System.out.print("Please enter your first name: ");
	firstName = names.nextLine();
	System.out.print("Please enter your middle name: ");
	middle = names.nextLine();
	System.out.print("Please enter your last name: ");
	lastName = names.nextLine();
	
	String firstInitial = firstName.substring(0,1).toUpperCase();
	String middleInitial = middle.substring(0,1).toUpperCase();
	String lastInitial = lastName.substring(0,1).toUpperCase();
	
	int nameLength1, nameLength2, nameLength3;
	nameLength1 = firstName.length();
	nameLength2 = middle.length();
	nameLength3 = lastName.length();
 
	String subName1 = firstName.substring(1,nameLength1).toLowerCase();
	String subName2 = middle.substring(1,nameLength2).toLowerCase();
	String subName3 = lastName.substring(1,nameLength3).toLowerCase();
	
	String lastNameBig = lastName.toUpperCase();
	
	System.out.println("Initials: "+firstInitial+"."+middleInitial+"."+lastInitial+".");
	System.out.println("Variation1: "+lastInitial+subName3+", "+firstInitial+subName1+" "+middleInitial+subName2);
	System.out.println("Variation2: "+lastNameBig+", "+firstInitial+subName1+" "+middleInitial+".");
	}
}