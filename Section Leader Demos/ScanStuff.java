import java.util.Scanner;

public class ScanStuff
{

   public static void main(String [] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number:");
      int num  = (int)input.nextDouble();
      
      System.out.println("\t\t" +num);
      System.out.println("\t \t" +num);
      String str1 = "\t\t";
      String str2 = "\t \t";
      System.out.println("\\t\\t and \\t_\\t are equal?: " + equalStr);
   
   }

}