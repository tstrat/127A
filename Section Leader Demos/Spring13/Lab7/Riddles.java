import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.IOException;

public class Riddles {

	public static void main(String[]args) throws IOException{
		int count = 1;
		
		while (count < 10){
			int rNum = count;
			String fileName = "riddle"+rNum+".txt";
	
			File riddles = new File(fileName);  		// Creates a new file for riddles.txt
			Scanner fileReader = new Scanner(riddles); 				// This scanner scans the file specified
			String currLine, answer = "";
			boolean endOfRiddle = false;
		
		
			while ( fileReader.hasNext() && !endOfRiddle ){
				currLine = fileReader.nextLine();
				if (currLine.equals("")){
					answer = fileReader.nextLine();
					endOfRiddle = true;
				}
				else
					System.out.println(currLine);
		
			}
		
			Scanner keyboard = new Scanner(System.in);
			System.out.print("\nYour answer is? : ");
			String userAnswer = keyboard.nextLine(); 
		
			System.out.println("...\n");
			System.out.println("Your answer was : "+ userAnswer);
			System.out.println("The real answer is: "+ answer);
			if (userAnswer.equalsIgnoreCase(answer))
				System.out.println("Contratz! You are right!");

			
			char more;
			System.out.println("Shall I continue?");
			more = keyboard.next().charAt(0);
		
			if (more == 'n' || more == 'N'){
				System.out.println("Okay then... :((((");
				return;
			}
			count++;
			if (count < 10)
				System.out.println("\nNext Riddle:\n");	
			
		}
	}

}