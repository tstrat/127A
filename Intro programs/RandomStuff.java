/* DOING SOME RANDOM STUFF */
import java.util.Random;

public class RandomStuff
{
   public static void main(String [] args)
   {
      long seed = 205L;
      Random generator = new Random(seed);

      // Seeds must be longs, or you can use no seed and it will be a new
      // random every time!

      int two = generator.nextInt(90)+10;

      int one = generator.nextInt(60)+10;
      //int two = generator.nextInt(90)+10;   // Order of generation matters
      System.out.println("1: " + one);
      System.out.println("2: " + two);
      System.out.println("3: " + (generator.nextInt(90)+10));   
   
   }

}