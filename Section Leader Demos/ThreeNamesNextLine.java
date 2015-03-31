import java.util.Scanner;


public class ThreeNamesNextLine
{
	public static void main(String[] args)
	{
	String firstName, middle, lastName;
	Scanner names = new Scanner(System.in);
	
	System.out.print("Please enter your first, middle, and last name: ");
	firstName = names.next();
	middle = names.next();
	lastName = names.next();
	
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