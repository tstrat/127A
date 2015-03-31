import java.util.Scanner;

public class StringComparison {

   public static void main(String[] args){
      String one, two;
      
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter string one: ");
      one = keyboard.next();
      System.out.print("Enter string two: ");
      two = keyboard.next();
      
      boolean equals = one==two;
            
      
      
      equals = true;
      if (one.length() != two.length())
         equals = false;
      else{
         int i = 0;
         while (i != one.length()){
            if (one.charAt(i) != two.charAt(i)){
               equals = false;
            }
            i++;
         }
      }
      System.out.println("String one equals String two? "+ equals);

      // Lets write our own loop to check equality.
   }


}