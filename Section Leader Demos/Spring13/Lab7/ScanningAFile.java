/* COMMENTS! */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ScanningAFile {

   public static void main(String[]args) throws IOException {
      
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter a filename: ");
      String filename = keyboard.next();
      
      //File myfile = new File(filename);
      
      Scanner fileReader = new Scanner(new File(filename));
      /*
      if ( fileReader.hasNextLine() ){
         String firstLine = fileReader.nextLine();
         System.out.println(firstLine);
      }
      */
      String space = " ";
      String nothing = "";
      
      System.out.println("'"+space +"' == '" + nothing +"' : " + space.equals(nothing));
      while ( fileReader.hasNextLine() ){
         String firstLine = fileReader.nextLine();
         if ( !firstLine.equals("") )
            System.out.println(firstLine);
      }
      
      
      
      
      
      
      
      
   }
}