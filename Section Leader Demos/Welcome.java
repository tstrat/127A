import java.util.Scanner;

//Programer: Travis Stratton
//This program prompts for users name and prints a nice message

public class Welcome {
	
	public static void main(String []args){
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is your name? ");
		String name = keyboard.nextLine();
		
		System.out.println("Hello " + name + ". I hope you are feeling well :-)" );
	}
	
}
