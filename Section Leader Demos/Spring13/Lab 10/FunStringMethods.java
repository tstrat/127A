public class FunStringMethods
{

   public static void main(String[]args)
   {
      String h = "hell..0";
      String java = "java";
      String java2 = "JAVA";
      String java3 = "java";
      
      String h1 = substring(h, 1, 4);
      System.out.println( indexOf(h, 'o') );
      System.out.println( h1 );
      System.out.println( equals(java, java2) );
      System.out.println( equals(java, java3) );
      System.out.println( equals(java, h) );
   
   
   }
   
   
   // String methods that we will write...
   
   // equals (string string)
   public static boolean equals(String a, String b)
   {
      //boolean isE = true;
      
      if (a.length() != b.length() )
      {
         //isE = false;
         return false;
      }
      for (int i = 0; i < b.length(); i++)
        if ( a.charAt(i)!= b.charAt(i) )
           return false;
              //isE = false;
      return true;
   }
   
   // indexOf (string char)
   public static int indexOf(String str, char c)
   {
      for (int i = 0; i < str.length(); i++)
      {
         if (str.charAt(i) == c)
            return i;
      }
      
      return -1;  
   
   }
   
   
   // substring (string int int)
   public static String substring(String str, int n, int m)
   {
      String next = "";
      
      for ( int i = n; i < m; i++)
         next = next + str.charAt(i);
      
      return next;
   }

}