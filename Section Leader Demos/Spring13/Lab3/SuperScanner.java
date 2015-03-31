/*
Travis Stratton

THIS IS MY SCANNER!

*/

import java.util.Scanner;

public class SuperScanner 
{

   public static void main (String [] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      String myName;
      System.out.print("Hi, What is your name? ");
      myName = keyboard.nextLine();
      
      System.out.println("Hello, " +myName);
      
      System.out.print("What is your favorite number?! (Enter a number): ");
      int favNum = keyboard.nextInt();
      //float favNum2 = keyboard.nextFloat();
      System.out.println("Oh wow! My favorite number is: " + (favNum * 5));
      
      float timesFive = favNum * 3.14f;
      System.out.println("YOUR NUM * 5 is: " + timesFive );
   
   }

}