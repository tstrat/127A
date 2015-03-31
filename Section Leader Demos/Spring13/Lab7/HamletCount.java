import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.IOException;

public class HamletCount {

	public static void main(String[]args) throws IOException{
      Scanner fileReader = new Scanner(new File("Hamlet.txt"));
      
      int count = 0;
      
      while (fileReader.hasNext()){
         if (fileReader.next().equalsIgnoreCase("hamlet")){
            count++;
         }
      }
      
      System.out.println("The word Hamlet appears "+count+" times");
   }
}