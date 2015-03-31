/*
	Travis Stratton
	Sec leader: Andrew Emmott
	Nov 5, 2010
	CSc 127A Lab 11
*/

import java.util.Scanner;

public class ArrayReverser {

	public static void main(String[] args) {
	
		Scanner user = new Scanner(System.in);
		int size = 0;
		int[] array;

		System.out.print("Enter the size of the array: ");
		size = user.nextInt();
		
		array = new int[size];
		int temp = 0;
		int end = size;
		
		for (int i = 0; i < size; i++){
			System.out.print("Enter a value: ");
			array[i] = user.nextInt();
		}
		
		for (int j=0 ; j < (size/2); j++) {
			temp = array[j];
			array[j] = array[end-1];
			array[end-1]= temp;
			end--;
		}
		
		for (int x = 0; x < size; x++){
			System.out.print(array[x]+" ");
		}
		
	}
	
}
