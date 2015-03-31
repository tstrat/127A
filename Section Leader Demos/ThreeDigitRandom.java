
import java.util.Random;
import java.util.Scanner;

public class ThreeDigitRandom
{
   public static void main(String [] args)
   {
      Scanner key = new Scanner(System.in);
      System.out.print("Please enter a seed: ");
      long seed = key.nextLong();
      
      Random gen = new Random(seed);
      int threeDigit = gen.nextInt(900) + 100;
      
      System.out.println("The random number is : " + threeDigit);
      
      int ones = threeDigit % 10;  // 345 % 10 => 5
      threeDigit = threeDigit / 10; // 345/10 => 34
      int tens = threeDigit % 10;  // 34 % 10 => 4
      threeDigit = threeDigit / 10;
      int hundreds = threeDigit % 10;
      
      
      System.out.println("Ones : " + ones);
      System.out.println("Tens : " + tens);
      System.out.println("Hundreds : " + hundreds);
      /*
      345
      ones 5
      tens 4
      hundred 3
      
      345/100  => 3
      345/10 => 34
      345%10 => 5
      345 % 100 => 45 / 10 => 4
      
      
      
      
      */
   }

}
