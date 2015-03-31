
import java.awt.Color;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;

public class Rainbow extends Observable {
   public static final Color RED = Color.RED;
   public static final Color ORANGE = Color.ORANGE;
   public static final Color YELLOW = Color.YELLOW;
   public static final Color GREEN = Color.GREEN;
   public static final Color BLUE = Color.BLUE;
   public static final Color VIOLET = new Color(138, 43, 226);
   public static final Color INDIGO = new Color(75, 0, 130);

   // Instance variables you'll need (you may need another)
   private Color[] colors; // The random array of Colors to "rainbow sort"
   private int n; // number of colors in the array

   // Arrange the array of Colors to the main rainbow colors in this order
   // Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE,
   // Color.VIOLET, and Color.INDIGO.
   // Or remember as "Roy G. Biv" and "Richard Of York Gave Battle In Vain"

   public void arrange() {
      // You must call the given swap(int, int) method below that also sends a
      // messages to update the Rainbow colors. Run RainbowGUI, click the
      // Rainbowize button and watch the swaps (should take about 20 seconds
      // unless you slide the slider bar for faster or slower animations). Then
      // remove this for loop:
     
      // ********************************
      // ********************************
      // ** YOUR CODE GOES BELOW HERE **
      // ********************************
      // ********************************
   

      //Selection Sort code should go here
	  for (int q = 0; q < colors.length; q++){
		  int min = q;
		  for (int p = q; p < colors.length; p++){
			  if ( compareColors(colors[p], colors[min]) < 0 ){
				  min = p;
			  }
		  }
		  swap(q, min);
		  
	  }
         
         
      // ********************************
      // *    END OF YOUR CODE      *
      // ********************************
   }


     /**********************    
     ***********************
     
     / How to use compareColors
     
     **********************
     **********************/

     //Determines if one color is less than, greater than, or equal to another.
     // If the first color is "less" than the second, it will return -1
     // If the first color is "greater" than the second, it will return 1
     // If the two colors are "equal" it will return 0
     private int compareColors(Color one, Color two){
         if (one.equals(two))
             return 0;
             
         if (one.equals(RED))
             return -1;
             
         if (one.equals(ORANGE) && two.equals(RED))
             return 1;
         else if (one.equals(ORANGE))
             return -1;
     
         if (one.equals(YELLOW) && (two.equals(RED) || two.equals(ORANGE)))
             return 1;
         else if (one.equals(YELLOW))
             return -1;
             
         if (one.equals(GREEN) && (two.equals(RED) || two.equals(ORANGE) || two.equals(YELLOW)))
             return 1;
         else if (one.equals(GREEN))
             return -1;
             
         if (one.equals(BLUE) && (two.equals(VIOLET) || two.equals(INDIGO)))
             return -1;
         else if (one.equals(BLUE))
             return 1;
             
         if (one.equals(INDIGO) && two.equals(VIOLET))
             return -1;
         else if (one.equals(INDIGO))
             return 1;
             
         if (one.equals(VIOLET))
             return 1;
             
     
         return 0;
     }
     
        // USE THIS SWAP METHOD!
// Swap colors[i] with colors[j]
    private void swap(int i, int j) {
      Color temp = colors[i];
      colors[i] = colors[j];
      colors[j] = temp;
     
   /** * DO NOT DELETE THE CODE BELOW THIS LINE! ** */
   // This code allows the GUI to show your algorithm in action
      this.setChanged();
      this.notifyObservers();
      sleep();
   }
    public class RainbowGUI {

    }


// randomizes the array
// Randomizes the array
    public void randomizeArray() {
   // Get an even number of colors into array (reverse sorted at the end)
      int i;
      for (i = 0; i < n - 7; i += 7) {
         colors[i + 6] = RED;
         colors[i + 5] = ORANGE;
         colors[i + 4] = YELLOW;
         colors[i + 3] = GREEN;
         colors[i + 2] = BLUE;
         colors[i + 1] = VIOLET;
         colors[i + 0] = INDIGO;
      }
   
   // Deal with uneven cases
      if(n % 7 != 0) {
         System.out.println(i);
         if(i < n) {
            colors[i] = INDIGO;
            i++;
         }
      
         if(i < n) {
            colors[i] = VIOLET;
            i++;
         }
      
         if(i < n) {
            colors[i] = BLUE;
            i++;
         }
      
         if(i < n) {
            colors[i] = GREEN;
            i++;
         }
      
         if(i < n) {
            colors[i] = YELLOW;
            i++;
         }
      
         if(i < n) {
            colors[i] = ORANGE;
            i++;
         }     
         System.out.println(i);
      }          
   
   // Shuffle the colors
      Random rnd = new Random();
      int a, b;
      for (i = 0; i < n; i++) {
         a = rnd.nextInt(n);
         b = rnd.nextInt(n);
         Color tmp = colors[a];
         colors[a] = colors[b];
         colors[b] = tmp;
      }
   }

// Other instance variables
   @SuppressWarnings("unused")
   private Color purple;
   private long speed;
   private Observer view;

// Constructor place low
    public Rainbow(int size, Observer theView) {
   // initialize some instance vars
      speed = 300;
      n = size;
      colors = new Color[size];
      purple = new Color(120, 0, 120);
      view = theView;
   // add Observers
      this.addObserver(view);
   
   // Randomize the array
      randomizeArray();
   } // complete this method

/*
* This method will make the current thread sleep for the specified ammount of
* time. This enables the GUI to display the animation in real-time.
*/
    private void sleep() {
      try {
         Thread.sleep(speed);
      }
          catch (InterruptedException e) {
         }
   }

// updates the speed based on the slider bar.
    public void updateSpeed(long newSpeed) {
      speed = newSpeed;
   }

// for the GUI
    public Color[] getArray() {
      return colors;
   }

}