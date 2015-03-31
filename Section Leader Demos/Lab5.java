import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Lab5{
   
   public static void main(String[]args) throws IOException{
      Scanner kbIn = new Scanner(System.in);
      String filename = kbIn.next();
      //File myFile = new File("myFile.txt");
      // Scanner fileScan = new Scanner(myFile);
      Scanner fileScan = new Scanner(new File(filename));
      
      while ( fileScan.hasNextLine() ){
         System.out.println(fileScan.next() + fileScan.next() + fileScan.next());
      }
      /*String stringOfNumbers = "35134 15367 234741 -1";
      Scanner kbIn =  new Scanner(stringOfNumbers);
      System.out.println("Enter a number ya FOO:");
      int num;
      int odd = 0, even = 0;
      for(num = kbIn.nextInt(); num != -1; num = kbIn.nextInt()){
         if (num % 2 == 1){
            odd++;
         }
         else{
            even++;
         }
         System.out.println(num);
      }
      
      System.out.println("Odds: " + odd + "\nEvens: "+ even);
      */
      
   }


}