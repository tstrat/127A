public class Vehicle
{
   private int numWheels;
   private String color;
   private int horsePower;
   private boolean interior;
   
   
   /*
      Vehicle car = new Vehicle(4, "red", 120, true);
   */ 
   public Vehicle(int wheels, String colorOfCar, int hp, boolean rich){
     setNumWheels(wheels);
     setColor(colorOfCar);
     horsePower = hp;
     interior = rich;
   }
   
   public int getNumWheels(){
      return numWheels;
   }
   
   public String getColor(){
      return color;
   }
   
   public int getHorsePower(){
      return horsePower;  
   }
   
   public boolean getInterior(){
      return interior;
   }
   
   
   public void setNumWheels(int newWheels){
      if (newWheels < 0){
         numWheels = 0;
      }
      else{
         numWheels = newWheels;
      }
   }
   
   public void setColor(String newColor){
      if (newColor.equalsIgnoreCase("Hot Pink")){
         color = "Black";
      }
      else{
         color = newColor;
      }
   }

   public void setHorsePower(int hp){
      horsePower = hp;
   }
   
   
   public void setInterior(boolean stuff){
      interior = stuff;
   }
   
   
   public boolean equals(Vehicle other){
      
      if (numWheels != other.getNumWheels()){
         return false;
      }
      if (horsePower != other.getHorsePower()){
         return false;
      }
      return true;
   }
}