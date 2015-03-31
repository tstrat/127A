/*
  	Travis Stratton
   Your section leader: Andrew Emmott
   Your section 10
	Date:  10/20/2010
   Description:Asks the user for a filename, then
	uses a scanner to print out the entire file.
*/

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class MyFileReader {
	
	public static void main (String[] args) throws IOException {
	
		Scanner user, file;
		String fileName = "", words = "";
		
		user = new Scanner(System.in);
		System.out.print("Please enter the name of a file: ");
		fileName = user.next();
		
		file = new Scanner(new File(fileName));
		
		System.out.println(fileName+" contains:");
		while (file.hasNext()) {
				words = file.nextLine();
				System.out.println(words);
		}
	}
}