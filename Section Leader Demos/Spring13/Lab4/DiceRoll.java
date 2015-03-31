import java.util.Random;

public class DiceRoll {

   public static void main(String[]args){
      long seed = 1234382741L;
      
      Random rand = new Random(seed);
      int dice = rand.nextInt(20)+1;
      
      System.out.println("You rolled: " + dice + "\nCongratz!");
      
   }
}