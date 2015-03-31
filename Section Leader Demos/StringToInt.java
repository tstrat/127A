import java.util.Scanner;

public class StringToInt
{
   public static void main(String [] args)
   {
      Scanner kbIn = new Scanner(System.in);
      System.out.print("Enter a string to change to int: ");
      String toConvert = kbIn.next();
   
      boolean allNums = checkString(toConvert);
      
      if (allNums){
         int finalNum = parser(toConvert);
         System.out.println(finalNum);
      }
      else {
         System.out.println("Invalid String");
      }

   }

   public static boolean checkString(String s){
      boolean isvalid = true;
      for (int i = 0; i < s.length(); i++){
         if (s.charAt(i) < '0' || s.charAt(i)> '9'){
            isvalid = false;
         }
      }
      return isvalid;
   }
   
   public static int parser(String toConvert){
      int num = 0;
         for(int i = 0; i < toConvert.length(); i++){
            char current = toConvert.charAt(i);
            int digit = current - '0';
            int power = toConvert.length() - (i+1);
            num += power(digit, power);
            
         }
      return num;
   }
   public static int power(int n, int p){
      for(int j = 0; j < p; j++){
               n *= 10;
      }
      return n;
   }
}