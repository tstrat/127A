/* Travis Stratton
*	
*	8/30/12, Section 7 @ 8-10 Thurs 
*
*  This is a demo of awesome data type initiation and use! WOHOO!!!
*/

public class AwesomeDataTypeDemo {

	public static void main(String[]args){
	
		// DATA TYPES!!!!
		byte myByte;
		short veryShort;
		int myInteger;
		long longNumber;
		
		float decimals;
		double longLongLongNumber;  // BAD USE OF VARIABLE NAMES
		
		char aLetter;
		boolean trueOFalse = true; // really?  You can always do better

		// Dont use int x and int y unless it makes sense with the math you are doing.
		
		myByte = 46;
		
		veryShort = 2;
		myInteger = 32500;
		longNumber = 5000000242L;
		
		
		System.out.println("My Byte is: " + myByte);
		System.out.println("My Short is: " + veryShort);
		System.out.println("My Int is: " + myInteger);
		System.out.println("My Long is: " + longNumber);
		System.out.println(); 
		// or System.out.print("\n");
		System.out.println("Boolean is true or false.");
		System.out.println("My boolean is : " + trueOFalse);
		
		//myInteger = longNumber;  // Why doesn't this work?
		
		//System.out.println("My Double is: " + longLongLongNumber); // And this one?
		
		
		veryShort = -456;
		aLetter = 'A';
		//System.out.println("====================="\n\n);
		//System.out.println("My Short is now: " + veryShort);
		//System.out.println("aLetter equals: " + aLetter);
		
		//System.out.println(myByte + " :with spaces looks like this: " + aLetter + " :see how multiple variables can be printed out?: " +longNumber);
		
	
		final int FINAL_INT = 3;
		//FINAL_INT = 5;   //TRY TO CHANGE ME I DARE YOU!!!
	
	
	} // end of main
	
} // end of program