/*
	Name: Travis Stratton
	Section Leader Name: Andrew Emmott
	Date: Oct 1, 2010
	Class: C Sc 127A Section 10
	Description:
		This program simulates a battle engine for a game using dice rolls
		using if/ else if statements.
*/

import java.util.Random;
import java.util.Scanner;

public class BattleEngineIf 
{

	public static void main(String[] args)
	{

		int seed, die;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a seed: ");  // asks for a seed for the random method.
		seed = input.nextInt();
		
		Random numb = new Random(seed);
		die = numb.nextInt(20)+1;  // Die between 1 and 20.
		
		if (die == 1){
			System.out.println("You swing and miss!");
		}
		else if (die <=4){
			int damage = numb.nextInt(5)+1;
			System.out.println("You stumble and do only "+damage+" damage.");
		}
		else if (die <=14){
			int damage = numb.nextInt(10)+1;
			System.out.println("You do "+damage+" damage.");
		}
		else if (die <=19){
			int damage = numb.nextInt(11)+5;
			System.out.println("You do "+damage+" damage.");
		}
		else if (die ==20){
			int damage = numb.nextInt(11)+5;
			System.out.println("Critial hit! "+(damage*2)+" damage.");
		}
		else {
			System.out.println("YOU SHOULD NOT SEE THIS EVER!");
		}

	}
}