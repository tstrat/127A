/**
*	Travis Stratton
*	Section 7
*	This program is a variant of Box.java but instead of filling the 
*	box with squares, I fill it with a circle.
*/
import java.util.Scanner;

public class CircleBox {

	public static void main(String[]args){
	   Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the fill character: ");
		char fillChar = keyboard.next().charAt(0);
		System.out.print("Enter the radius for the circle: ");
		int radius = keyboard.nextInt();
		drawBar(radius);
		buildCircle(fillChar, radius);
		drawBar(radius);
	}
	
	public static void drawBar(int n){
		System.out.print("+");
		for (int i = -n; i < n; i++){
			System.out.print("-");
		}
		System.out.println("+");

	}
	
	public static void buildCircle(char fillChar, int n){
		for (int i  = -n; i <= n; i++){
			System.out.print("|");
			for(int j = -n; j <= n; j++){
				if((i*i + j*j) <= (n*n))
				   System.out.print(fillChar);
				else
					System.out.print(" ");
			}
			System.out.print("|");
			System.out.println();
		}
	}
}