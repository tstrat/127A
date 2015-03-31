import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class whileLoop{
   public static void main(String [] args) throws IOException{
   
   //int n;
   //int total = 1;
   //Scanner kbIn = new Scanner(System.in);
  /*
   n = kbIn.nextInt();
   int index = 1;
   while (index < n){
      total *= index;
      index++;
   }
   System.out.println("Total while == "+ total);
   
   total = 1;
   for(index = 1; index < n; index++){
      total *= index;
   }
   System.out.println("Total for == "+ total);
   */
   /*
   for(int i = 0; i < 5; i++){
      for(int k = i; k< 5; k++){
         System.out.println("i == " +i +"\tk == "+k);
      }
   
   }
   */
   /*
   final char a = 'a';
   switch('a'){
      case a:
         System.out.println("YES");
         break;
      default:
         System.out.println("NO!");
   }
   */
   
   Scanner one = new Scanner(new File("AwesomeDataTypeDemo.java"));
   int count = 0;
   while (one.hasNextLine()){
      System.out.println(one.nextLine());
      count ++;
   }
   System.out.println("The file has "+count+" lines.");
   //one.next(); // COOL!
   //one.next();  // NOT IN STRING
   
   }
}