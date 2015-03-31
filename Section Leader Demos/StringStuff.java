import java.util.Scanner;
import java.util.Random;

public class StringStuff{

   public static void main(String [] args)
   {
      Random gen = new Random();
      Scanner keys = new Scanner(System.in);
      
      
      // ape boy cat dog pig 
      System.out.println("Enter words: ");
      String words = keys.nextLine();
      System.out.println("How long is each word? ");
      
      int len = keys.nextInt() + 1;
      int numberOfWords = words.length() / len;
      
      int toPrint = gen.nextInt(numberOfWords);
      // 3
      int start = (toPrint * len);
      String substr = words.substring(start,start+len-1);
      System.out.println(substr);
   
   }

}