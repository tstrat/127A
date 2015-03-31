/* Travis Stratton
	Sec. Leader: Andrew Emmott
	Date: Wednesday, October 13th
	Assignment 6- Program #1.
	CSc 127A, Fall 2010.
	Description:
		Program takes a base word from user
		then compares it to new words unitl
		the user types stop to stop entering words.
		then analyzes which words were similar or
		exactly the same.
*/

import java.util.Scanner;

public class FindWord {
	
	public static void main(String[] args) {
	
		Scanner user = new Scanner(System.in);
		String word1 = "", word2 = "";
		int equal, equalIgnore, letterEquals, letterEqualsIgnore;
		equal = 0;
		equalIgnore = 0;
		letterEquals = 0;
		letterEqualsIgnore = 0;
		
		System.out.print("Enter a search word: ");
		word1 = user.next();
		System.out.print("Enter a word, type 'stop' to halt: ");
		word2 = user.next();
		
		while ( !(word2.equalsIgnoreCase("stop")) ) {
			if (word1.equals(word2) ) {
				equal++;
			}
			else if (word1.equalsIgnoreCase(word2)) {
				equalIgnore++;		
			}
			
			if ( word1.substring(0,1).equals(word2.substring(0,1)) ) {
				letterEquals++;
			}
			else if ( word1.substring(0,1).equalsIgnoreCase(word2.substring(0,1)) ) {
				letterEqualsIgnore++;
			}
			
			System.out.print("Enter a word, type 'stop' to halt: ");
			word2 = user.next();	
		}
		
		System.out.println();
		System.out.println("computer appears "+ equal +((equal == 1) ? " time" : " times"));
		System.out.println("computer appears "+ equalIgnore +((equalIgnore == 1) ? " time " : " times ")+"when case does not match");
		System.out.println(letterEquals+ ((letterEquals == 1) ? " word " : " words ")
									+"start with the same letter as computer");
		System.out.println(letterEqualsIgnore+ ((letterEqualsIgnore == 1) ? " word " : " words ") 
									+"start with the same letter as computer but the opposite case");
									/* I noticed that the assignment has the word 'case' on a separate line
										but I thought that might have been due to running out of space on the
										page so I did not create a separate line for it.
									*/
	}
}