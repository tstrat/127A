import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;

public class PhoneNumberGenerator
{
	public static void main(String[] args)
	{
		Scanner areaNumber = new Scanner(System.in);
		int areaCode;
		System.out.print("Please enter the area code: ");
		areaCode = areaNumber.nextInt();
		
		Random gen = new Random();
		int rand = gen.nextInt(1000);
		int rand2 = gen.nextInt(10000);
		int rand3 = gen.nextInt(1000);
		int rand4 = gen.nextInt(10000);
		int rand5 = gen.nextInt(1000);
		int rand6 = gen.nextInt(10000);
		DecimalFormat myFormat1 = new DecimalFormat("000");
		DecimalFormat myFormat2 = new DecimalFormat("0000");
		System.out.println("First number to call -("+areaCode+")"+
								 myFormat1.format(rand)+"-"+myFormat2.format(rand2));
		System.out.println("Second Number to call -("+areaCode+")"+
								 myFormat1.format(rand3)+"-"+myFormat2.format(rand4));
		System.out.println("Third Number to call -("+areaCode+")"+
								 myFormat1.format(rand5)+"-"+myFormat2.format(rand6));
	}
}