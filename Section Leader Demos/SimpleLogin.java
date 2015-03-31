/*
	Name: Travis Stratton
	Section Leader Name: Andrew Emmott
	Date: Oct 1, 2010
	Class: C Sc 127A Section 10
	Description:
		This program preforms a login opperation using nested if statements.
*/

import java.util.Scanner;

public class SimpleLogin
{

	public static void main(String[] args)
	{
		
		String inputName, password;
		Scanner userName = new Scanner(System.in);
	
	
	
		String admin , SL, root;  // Identifying valid usernames
		admin = "admin";
		SL = "Section_Leader";
		root = "root";

		String userPass1, userPass2, userPass3; // Identifying valid passwords
		userPass1 = "r420r91rL";
		userPass2 = "CompSciFTW";
		userPass3 = "NerfHerdersSon";
		
		
		System.out.print("Username: ");
		inputName = userName.nextLine();
		
		
		if (admin.equalsIgnoreCase(inputName) || SL.equalsIgnoreCase(inputName) // asks if valid passwords = input
						|| root.equalsIgnoreCase(inputName) ) {
						
			System.out.print("Password: "); 
			password = userName.nextLine();
			
			if ( password.equals(userPass1) ) {								// asks if password is valid
				System.out.println("Welcome "+admin+'!');
			}
			else if ( password.equals(userPass2) ) {
				System.out.println("Welcome "+SL+'!');
			}
			else if ( password.equals(userPass3) ) {
				System.out.println("Welcome "+root+'!');
			}
			else {																
							System.out.println("Incorrect password!");		// result if pass is not valid
			}
		}
		else {																	
					System.out.println("Unknown user!");			// result if username is invalid

		}	
	
	}

}