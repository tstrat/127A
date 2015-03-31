public class Fib{
   public static void main(String[]args){
      //  1 1 2 3 5 8 13
      int n = 512;
      int count = 2;
      
      long first, second;
      second = first = 1;
      long third = 0;
      while (count < n){
         third = first + second;
         first = second;
         second = third;
         count++;
      }
      
      System.out.println(third);
   
      
   
   
   
   
   
   
   
   }
   
}