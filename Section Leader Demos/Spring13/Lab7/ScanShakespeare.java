import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ScanShakespeare {

	public static void main(String[]args)throws IOException{
		
		Scanner fileScanner = new Scanner(new File("shakespear.txt"));
		
		while(fileScanner.hasNextLine()){
			System.out.println(fileScanner.nextLine());
		}
		
	}
}