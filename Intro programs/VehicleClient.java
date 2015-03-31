public class VehicleClient
{
   public static void main(String [] args)
   {
      Vehicle car1 = new Vehicle(-500, "red", 120, true);
      System.out.println("My Car has " + car1.getNumWheels() +" wheels");
      Vehicle car2 = new Vehicle(-500, "red", 120, true);
      
      System.out.println("Car1 and Car2 ==? " + car1.equals(car2));
   }


}