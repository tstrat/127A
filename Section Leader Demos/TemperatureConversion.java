import java.util.Scanner;

//Programmer: Travis Stratton
//This program prompts the user for a temperature in Fahrenheit, then converts it to Celcius

public class TemperatureConversion {
	
	public static void main(String[] args){
		double celcius = 5.0/9;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter Fahrenheit temperature: ");
		double temp = keyboard.nextDouble();
		
		celcius *= (temp-32.0);
		
		System.out.println(temp+" Fahrenheit is "+ celcius+" Celsius");
	
	}
	
}
