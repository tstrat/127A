/*
	Name: Travis Stratton
	Section Leader Name: Andrew Emmott
	Date: Oct 1, 2010
	Class: C Sc 127A Section 10
	Description:
		This program simulates a battle engine for a game using dice rolls
		using switch/case.
*/

import java.util.Scanner;
import java.util.Random;

public class BattleEngineCase 
{

	public static void main(String[] args)
	{
	
		int seed, die;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a seed: ");
		seed = input.nextInt();
		
		Random numb = new Random(seed);
		die = numb.nextInt(20)+1;
		
		switch (die) {
		case 0:
		case 1:
			System.out.println("You swing and miss!");
			break;
		case 2: // let 2-4 all fall through to case 4.
		case 3:
		case 4:
			int damage = numb.nextInt(5)+1;
			System.out.println("You stumble and do only "+damage+" damage.");
			break;
		case 5: // let 5-14 all fall through to case 14.
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
			int damage2 = numb.nextInt(10)+1;
			System.out.println("You do "+damage2+" damage.");
			break;
		case 15: // let 15-19 all fall through to case 19.
		case 16:
		case 17:
		case 18:
		case 19:
			int damage3 = numb.nextInt(11)+5;
			System.out.println("You do "+(damage3)+" damage.");
			break;
		case 20:
			int damage4 = numb.nextInt(11)+5;
			System.out.println("Critical hit! "+(damage4*2)+" damage.");
			break;
		default:
			System.out.println("BLAH");
		}
	}
	
}