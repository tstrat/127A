/*  Programmer: Travis Stratton
*
*		OFF WITH HER HEAD!
*/
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.net.*;

public class OffWithHerHead extends JFrame 
{
	
	private boolean gs = false, win = false;
	



	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Alice is on trial, and the Red Queen,"+
								" evil as she is, is the judge and jury.");
		System.out.println("You get to choose to defend Alice in hopes"+ 
								" that Queen forgives Alice for her \ncrimes or"+
								" say she's guilty and looses her head!.");
		System.out.println();
		System.out.println("First case:  \nAlice is charged with 2 acounts "+
								"of illegally using shrinking and growth food.");
		System.out.println("She claims that she had no choice, and she did it"+
								" to follow the Rabbit");
		
		System.out.print("\nShould she loose her head for eating food? (true or false): ");
								
		Boolean firstAnswer = keyboard.nextBoolean();
		
		if (firstAnswer){
			System.out.println();
			System.out.println("<RedQueen>: \"OFF WITH HER HEAD!!!!\"");
		}
		else{
			System.out.println("\n<RedQueen>:  \"Fine! But she did more...\"");
		
			System.out.println();
			System.out.println("Second case:  \nAlice is charged with tripping "+
								"the Queen in a game of gerbal croquet.");
			System.out.println("She claims that she did no such thing and that "+
								"the Queen fell on her own.");
								
			System.out.println("\nIs Alice innocent? (true or false)");
			
			Boolean secondAnswer = keyboard.nextBoolean();
			
			if (!secondAnswer){
				System.out.println();
				System.out.println("<RedQueen>: \"OFF WITH HER HEAD!!!!\"");
			}
			else{
				System.out.println("<RedQueen>: \"Oh, you have GOT to be kidding!  She is GUILTY I SAY!\"");
				System.out.println("<Alice>   : \"You are a horrible person!\"");
				System.out.println("<RedQueen>: \"She INSULTED ME! OFF WITH HER HEAD! OFF WITH ALL THEIR HEADS!\"");
				
				System.out.println("\nDo you:");
				System.out.println("1) Help Alice");
				System.out.println("2) Run away");
				System.out.println("3) Gangnum Style!");
				System.out.print("Choice: ");
				int answer = keyboard.nextInt();
				String lose = "Hi, you lose!";
				System.out.println();
				if( answer == 1){
					System.out.println("You help Alice.  She gets through the rabbit hole and"+
											"\n makes it back into the real world! The evil Red Queen"+
											"\n however, captures you! In a evil, low tone, the Qeen "+
											"\n hovers above you and says:" +
											"\n\"Off... with... your... head!\"");
					System.out.println("\n...\n\nYOU GET NOTHING! YOU LOSE!\nGOOD DAY, SIR!");
				}
				else if (answer == 2){
					System.out.println("You run. As you run you shove down anything or anyone"+
											"\nin your way.  Mad Hatter? Shoved down.  Mr. Rabbit? "+
											"\nOn the floor.  You make it to the rabbit hole just in time"+
											"\nand escape.  You see Alice as you emerge into the real world."+
											"\nYou both look at each other, then laugh!"); 
					System.out.println("\n\n....\n\nYou are free! Congratulations!\nGood Ending!");
					win =true;
				}
				else if(answer == 3){
					String a = "LOLOLOLOL";
					System.out.println("You break out into the most amazing dance routine"+
											"\nthat no one has EVER seen!  The rhythm is so entrancing"+
											"\nit makes all the guards start to move to the beat."+
											"\nPretty soon, the whole royal army is jamming to Gangnam"+
											"\nStyle!  Because of your amazing SWAG, they dub you the"+
											"\nRoyal High King of Wonderland.  You pardon Alice and live"+
											"\na life full of Asian Pop dancing and Music!");  
					System.out.println("\n....\n\nYou win.  Period. No exceptions. Congratulations!\nBest Ending EVER!");
					win = true;
					gs = true;
				}
				else{
					String a = "WILLY WONKA!";
					System.out.println("You do nothing.  Guess you couldn't choose one of my"+
											"\nawesome scenarios...  Oh well!  OFF WITH YOUR HEAD!");
					System.out.println("\n...\n\nYOU GET NOTHING! YOU LOSE! GOOD DAY, SIR!");
				} // end of else
				
				//System.out.println(lose);
			
			} // end of 2nd choice
		}// else of third choice
	}// main method
	
	public OffWithHerHead(){
		if (win && gs){
			try{
				URI theURI = new URI("http://www.youtube.com/watch?v=9bZkp7q19f0");
				java.awt.Desktop.getDesktop().browse(theURI);
			}catch(Exception e){}
		}
		else if (!win){
			try{
				URI theURI = new URI("http://www.youtube.com/watch?v=M5QGkOGZubQ");
				java.awt.Desktop.getDesktop().browse(theURI);
			}catch(Exception e){}
		}
		else{
			try{
				URI theURI = new URI("http://cdn.memegenerator.net/instances/400x/32975968.jpg");
				java.awt.Desktop.getDesktop().browse(theURI);
			}catch(Exception e){}

		}
	}
}