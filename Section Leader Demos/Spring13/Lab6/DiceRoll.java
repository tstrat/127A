/* Improved Random Dice */

import java.util.Random;

public class DiceRoll {
   
   public static void main(String[]args){
      
      Random rand = new Random();
      int dice = rand.nextInt(20)+1; // die roll 1-20
      
      //dice = 20;
      System.out.println("Die is: " + dice);
      if (dice == 20){
         System.out.println("Perfect roll!");
      }
      else if (dice > 14){
         System.out.println("Great Roll!");
      }
      else if (dice < 6){
         System.out.println("Bad Roll");
      }
      else{
         System.out.println("Average");
      }
   }
}